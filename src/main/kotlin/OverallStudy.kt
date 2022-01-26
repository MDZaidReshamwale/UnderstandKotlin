import java.util.*

class OverallStudy() {
    fun exp(){
    val scanner  = Scanner(System.`in`)
        println("Enter the name")
    var name = scanner.next()
    println("Enter the age")
    var age = scanner.nextInt()
    println("Enter the salary")
    var salary = scanner.nextDouble()
    println("Are u married (true/ false)")
    var isMarried = scanner.nextBoolean()



    fun loanChart(bank: String?) {
        println("Enter the bank name")
        when (bank) {


            "신한" -> println("신한은 신용대출이 가능합니다.")
            "우리" -> println("우리은 신용대출이 가능합니다.")
            "국민" -> println("국민은 신용대출이 가능합니다.")
            "외환" -> println("외환은 신용대출이 가능합니다.")
            "신협" -> println("신협은 신용대출이 가능합니다.")
            "우체국" -> println("우체국은 신용대출이 가능합니다///.")
            "하나" -> println("하나은 신용대출이 가능합니다.")
            "신협" -> println("신협은 신용대출이 가능합니다.")
            "우리" -> println("우리은 신용대출이 가능합니다.")
            "신한" -> println("신한은 신용대출이 가능합니다.")
            else -> println("I don't know anything about it")

        }
    }

    fun loanInterest(loanAmount: Double, loanTime: Int): Double {
        return loanAmount * loanTime * 0.01
    }

    fun loan(){
    if(age > 20 && salary > 200000.0)
    {
        println("$name is eligible for loan")
    }
    else
    {
        println("$name is not eligible for loan")
    }
}

    }
    }


