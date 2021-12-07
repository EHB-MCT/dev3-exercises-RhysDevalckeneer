class Duolingo {
    private var roundSize: Int = 5
    private var language: String = "en"

    constructor(roundSize: Int, language: String) {
        this.roundSize = roundSize
        this.language = language
        filterByLanguage()
    }

    constructor(difficulty: String) {
        when (difficulty) {
            "easy" -> {
                this.roundSize = 3
                this.language = arrayOf("en", "fr").random()
            }
            "hard" -> {
                this.roundSize = 6
                this.language = "all"
            }
        }
        filterByLanguage()
    }

    private var words = setOf<Word>(
        EnglishWord("bread", "brood"),
        FrenchWord("ordinateur", "computer"),
        EnglishWord("trophy", "trofee"),
        FrenchWord("vache", "koe"),
        EnglishWord("leisure", "ontspanning"),
        EnglishWord("capital", "hoofdstad"),
        FrenchWord("aimer", "houden van"),
        FrenchWord("sapin de noel", "kerstboom"),
        FrenchWord("nain de jardin", "tuinkabouter"),
        FrenchWord("bob et bobette", "suske en wiske"),
        EnglishWord("general practitioner", "huisdokter"),
        EnglishWord("cow", "koe"),
    )

    fun filterByLanguage() {
        if (language != "all") {
            words = words.filter { it.language == language }.toSet()
        }
    }

    fun play() {
        val wordsToPlay = words.shuffled().take(roundSize).toMutableSet()

        while (wordsToPlay.isNotEmpty()) {
            val randomWord = wordsToPlay.random()
            println("What is the translation of ${randomWord.original}?")
            val userAnswer = readLine()
            Thread.sleep(100);
            if (randomWord.translated == userAnswer) {
                println("Good one! ${randomWord.translated} was indeed the answer")
                wordsToPlay.remove(randomWord)
            } else {
                println("Ah, almost... We were looking for ${randomWord.translated}")
            }

            if (wordsToPlay.isNotEmpty()) {
                println("${wordsToPlay.size} ${if (wordsToPlay.size == 1) "word" else "words" } left")
            }

            Thread.sleep(400);
        }
    }
}