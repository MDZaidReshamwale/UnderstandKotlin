package Collections

fun main(){
    val learnList = List().myList()
    println(learnList)
}


class List {

    fun myList(){
//        list
        println("NOTE - A list can have string number any data type and duplicates")


//        list of any type
        println("Difference between list and array")
        println("List of any type")
        val names  = listOf("Zaid", "Zainab", "Zeeba " , 7.7, "Zaid", 7.7)
        println(names)

//        list
        println()
        println("Specific element in list (non generic)")
        val fullName = mutableListOf<String>("MohammedZaid", "Zaid", "Reshamwale")
        println(fullName)
        println("Adding anyother type (int,float) element in list returns error")


//        array of any type
        println()
        println("Array of any type")
        val name  = arrayOf("Zaid", "Zainab", "Zeeba ", 7.7, "Zaid", 7.7)
        println(name)
//        to print array
//       using for loop to print array
        println("Using for loop to print array")
        for (i in name){
            println(i)
        }

//        using the forEach loop to print array
        println("Using the forEach loop to print array")
        name.forEach {
            println(it)
        }

        println()
//        Mutable nd Immutable list
        println("Mutable nd Immutable list")
        println("Mutable list")
        val mutableList = mutableListOf("Zaid", "Zainab", "Zeeba ")
        println(mutableList)
        mutableList.add("ZaidReshamwale")
        println(mutableList)

        println()
        println("Immutable list")
        val immutableList = listOf("Zaid", "Zainab", "Zeeba ")
        println(immutableList)
        println("Can't add element in immutable list and make changes in the list")
        //immutableList.add("ZaidReshamwale") //error


        println()
        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.uppercase() }
            .forEach { println(it) }


    }


}