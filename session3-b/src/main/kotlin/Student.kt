class Student(override val name: String): Person(name) {
    fun gossip() {
        println("hahahaha")
    }

    fun talk() {
        gossip()
    }
}