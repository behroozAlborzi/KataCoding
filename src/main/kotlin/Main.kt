

fun main(args: Array<String>) {
    println("Hello World!")

//    val dicRange : IntRange = 1..6
////    var randomNumber:Int?
//    repeat(10){ it ->
////        randomNumber = dicRange.random()
//        println("Random Number ${it+1}: ${dicRange.random()}")
//    }

//    val mySixDice = Dice(6)
    //println("My First Dice sides are ${myFirstDice.sides}")
    //myFirstDice.roll()
    ///val diceRoll = myFirstDice.roll()
//    println("My Six Dice sides are ${mySixDice.numSide} and Dice Roll : ${mySixDice.roll()}")
//
//    val myTenDice = Dice(10)
//    println("My Ten Dice sides are ${myTenDice.numSide} and Dice Roll : ${myTenDice.roll()}")


}

class Dice(private val numSide:Int){

//    var sides = 6

    fun roll():Int{
/*       val dice:IntRange = 1..numSide  */
        //val randomNumber = dice.random()
        //println("$sides sided dice rolled $randomNumber")
        return (1..numSide).random()
    }

}