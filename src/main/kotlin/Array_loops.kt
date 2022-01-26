class Array_loops {

    fun eveod(num :Int, type : String) {
    try{
    when (type) {
        "even" -> {
            for (i in 0..num) {
                if (i % 2 == 0)
                    println(i)


            }
        }
        "odd" -> {
            for (i in 0..num) {
                if (i % 2 != 0)
                    println(i)

            }
        }
        else -> {
            println("Invalid input")
        }
    }

    } catch (e: Exception ){
        println(Exception())
    }

    }




//    loops
    fun loops() {
//        print 0  to 100 values
    for (x in 0..100) {
        println(x)
    }
    println("")
//        print 0 to 100 values in reverse order
    for (x in 100 downTo 0) {
        println(x)
    }
    println("")
//        print the table of 13
    for (x in 1..10) {
        println("13 x $x = ${13 * x}")
    }
    println("")
//        print the table of 13
    for (x in 13..130 step 13) {
        println(x)
    }

}

    }

