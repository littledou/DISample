package cn.readsense.koinsample.oben

class Student(val course: SchoolCourse, val friend: Friend) {

//    val course: SchoolCourse = SchoolCourse()
//    val friend: Friend = Friend()

    fun beSmart() {
        course.study()
        friend.hangout()
    }
}

class SchoolCourse {
    init {
        println("SchoolCourse init")
    }

    fun study() = println("SchoolCourse study")
}

class Friend {
    init {
        println("Friend init")
    }

    fun hangout() {
        println("Friend hangout")
    }
}