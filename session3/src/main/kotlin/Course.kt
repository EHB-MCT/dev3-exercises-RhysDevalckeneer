class Course(
    val title: String,
    val description: String,
    val studyPoint: Int,
    val semester: Number) {

    fun displayCourse() {
        println("${title}, ${description}, ${studyPoint}, ${semester}")
    }

}