class loops {

    fun loops() {
        // for
        for (i in 1..10) {
            println(i)
        }
        // while
        var i = 1
        while (i <= 10) {
            println(i)
            i++
        }
        // do while
        do {
            println(i)
            i++
        } while (i <= 10)
        // for each
        val list = listOf("a", "b", "c")
        for (s in list) {
            println(s)
        }
        // for each with index
        for ((index, value) in list.withIndex()) {
            println("$index: $value")
        }
//        foreach
        list.forEach { println(it) }
        // for each with index
        list.forEachIndexed { index, value -> println("$index: $value") }
    }
}