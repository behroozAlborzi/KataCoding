// Best practices :
//return n * if (n % 2 == 0) 8 else 9
fun simpleMultiplication(n: Int): Int = if (n % 2 == 1) n * 9 else n * 8

// Best practices :
//fun doubleInteger(i:Int) = i*2 or return i shl 1

fun doubleInteger(i: Int): Int = i * 2

fun numberToString(num: Int): String = num.toString()


fun move(position:Int,roll:Int):Int = (roll * 2 ) + position