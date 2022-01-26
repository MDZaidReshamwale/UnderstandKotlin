class Functions {

//    function without parameters
     fun myfun(){
        println("Function without parameter")
    }

//  function with one parameter
    fun myfunpar(a:Int){
        println("Function with parameter $a")
    }

    //  function with two parameter
    fun myfunnpar(a:String ,b:Int){
        println("Function with two parameter $a and $b")
    }

    //  function with return type
    fun fullname(firstname:String,lastname:String,age:Int):String{
        return "My name is $firstname $lastname \n I am $age years old"
    }

//          function returns no meaningful value.
    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }

//    function as an expression
    fun sum(a: Int, b: Int) = a + b


}