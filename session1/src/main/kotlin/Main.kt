fun main() {
    val options = arrayOf("Rock", "Paper", "Scissor", "Lizard", "Spock")
    val computerChoice = options.random()
    val userChoice = getUserChoice(options)

    println("Computer picked $computerChoice")
    println("User picked $userChoice")
    determineWinner(computerChoice, userChoice)

    fun getUserChoice(options: Array<String>): String? {
        var userChoice: String?
        do {
            println("Make your choice: rock - paper - scissor")
            userChoice = readLine()
        } while(!options.contains(userChoice)) {
            return userChoice
        }
    }

    fun determineWinner(computerChoice: String, userChoice: String) {
        if(computerChoice === userChoice) {
            println("It's a draw")
            return
        }
    }

    val winMessage = "You've won!"
    val loseMessage = "You've lost!"

    when(computerChoice) {
        "rock" -> if (userChoice == "paper") println(winMessage) else println(loseMessage)
        "paper" -> if (userChoice == "scissors") println(winMessage) else println(loseMessage)
        "scissors" -> if (userChoice == "rock") println(winMessage) else println(loseMessage)

    }
}

