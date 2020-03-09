package i

fun main() {

    // 코틀린은 자동으로 형변환하지 않는다.
    val number1:Int = 55
    //val number2:Long = number1  // error
    val number2:Long = number1.toLong()
    val number3:Byte = number1.toByte()
    val number4:Float = number1.toFloat()
    val number5:Double = number1.toDouble()

}