fun main() {
    intro()
}

// value.contains()
// can be used

// val correctAnswers = mutableListOf("one", "two")
// val givenAnswers = mutableListOf("one", "two", "three", "four")

fun intro() {
    val welcomeText =  "\n \n Space: the final frontier. These are the voyages of the starship Enterprise. Its continuing mission: to explore strange new worlds. To seek out new life and new civilizations. To boldly go where no one has gone before!"
    println(welcomeText)

    challengeOne()
}

fun challengeOne() {
    val introChallengeOne = "\n You were beamed down in Klingon territory and were noticed by a Klingon Commander. He challenges you to a Klingon dice game. \n Do you want to play? Type yes or no"
    println(introChallengeOne)

    val answerOne = readLine();

    if(answerOne == "yes"){
        println("\n You accepted the challenge \n")

        challengeTwo()
    } else if (answerOne == "no") {
        gameOver()
    }
}

fun challengeTwo() {
    println("Pick a number between 1 and 6. If you guess correctly, you may live");

    challengeThree()
}

fun challengeThree() {
    challengeFour()

    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x is neither 1 nor 2")
        }
    }
}

fun challengeFour() {
    challengeFive()
}

fun challengeFive() {

}

// roll dice function
fun rollDice(sides: Int): Int {
    return (Math.random() * sides + 1).toInt()
}

fun success() {
    println("Good job! You won the game!")
}

fun gameOver() {
    println("Sorry, you lost! But you can give it another")
}