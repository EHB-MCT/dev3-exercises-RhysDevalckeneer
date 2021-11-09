open class Person(open val name: String) {

    fun introduce() {
        println("Hello, my name is $name")
    }

    fun chat() {
        println("chat")
    }
}