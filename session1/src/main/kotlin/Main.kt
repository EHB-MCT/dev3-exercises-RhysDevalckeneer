fun main() {
    val options = arrayOf("Rock", "Paper", "Scissor", "Lizard", "Spock")
    val computerChoice = options.random()
    val userChoice = getUserChoice(options)

    println("Computer picked $computerChoice")
    println("User picked $userChoice")
    determineWinner(computerChoice, userChoice)
}

fun getUserChoice(options: Array<String>): String? {
    var userChoice: String?
    do {
        println("Make your choice: Rock - Paper - Scissors - Lizard - Spock")
        userChoice = readLine();
    } while (!options.contains(userChoice))
        return userChoice
}

fun determineWinner(computerChoice: String, userChoice: String?) {
    if(computerChoice == userChoice) {
        println("It's a draw")
        return
    }

    val winMessage = "You've won!"
    val loseMessage = "You've lost!"

    when(computerChoice) {
        "rock" -> if (userChoice == "paper" || userChoice == "spock") println(winMessage) else println(loseMessage)
        "paper" -> if (userChoice == "scissors" || userChoice == "lizard") println(winMessage) else println(loseMessage)
        "scissors" -> if (userChoice == "rock" || userChoice == "spock") println(winMessage) else println(loseMessage)
        "lizard" -> if (userChoice == "rock" || userChoice == "scissor") println(winMessage) else println(loseMessage)
        "spock" -> if (userChoice == "lizard" || userChoice == "paper") println(winMessage) else println(loseMessage)

    }
}

