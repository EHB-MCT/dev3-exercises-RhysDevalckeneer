class Teacher (override val name: String): Person(name){
    fun funFact() {
        println("hahahah")
    }

    fun talk() {
        funFact()
    }
}