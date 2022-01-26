package Classes

fun main(){
    val tile : SealedTile = SealedTile.RedT("I am red",30)
    val points : Unit = when (tile){
        is SealedTile.RedT -> println("Red tile with points ${tile.points * 2}")
        is SealedTile.BlueT -> println("Blue tile with points ${tile.points * 3}")
        is SealedTile.GreenT -> println("Green tile with points ${tile.points * 4}")
     }
//    val t1 = SealedTile.RedT("I am red",30)
//    println("${t1.points} - ${t1.type}")
}

//sealed class
sealed class SealedTile {
class RedT(val type: String, val points : Int) : SealedTile()
    class BlueT(val type: String, val points : Int) : SealedTile()
    class  GreenT(val type: String, val points : Int, val rating : Float) : SealedTile()
}