class Comedian(override val name: String): Person(name) {
    fun tellJoke() {
        println("hahhaha")
    }

    fun talk() {
        tellJoke()
    }
}