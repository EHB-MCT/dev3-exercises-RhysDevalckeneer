fun main() {

    val persons = arrayOf(Person("Jos"), Person("Joachim"))

    val randomPerson = persons.random()

    randomPerson.introduce()
}