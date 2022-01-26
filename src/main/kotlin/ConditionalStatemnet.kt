class ConditionalStatemnet {

     val x =30
     val y =20
     val z =10

//    if
    fun ifStatement(): Int {
        if (x > y) {
            println("x is greater than y")
        } else {
            println("x is less than y")
        }

    //    another way for using if or ternary operator ??? In Kotlin, if can also be used as an expression.
    val result: Int = if (x > y) x else y
    return result
    }

//    when condition
     fun enterMonth ( month : Int ) : String {
    return when (month) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Invalid month"
    }
}


}