package Classes

enum class  EnumDays(val day: Int) {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

   fun totalDays(){
       println("Total days in a week: ${EnumDays.values().size}")
       println("Day is $this")
   }
}