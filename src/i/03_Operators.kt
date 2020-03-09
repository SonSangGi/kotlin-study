package i

fun main() {
    val number1 = 12.5
    val number2 = 3.5
    var result: Double

    result = number1 + number2
    println("number1 + number2 = $result")
    // 16.0
    result = number1 - number2
    println("number1 - number2 = $result")
    // 9.0
    result = number1 * number2
    println("number1 * number2 = $result")
    // 43.75
    result = number1 / number2
    println("number1 / number2 = $result")
    // 3.5714285714285716
    result = number1 % number2
    println("number1 % number2 = $result")
    // 2.0

    /** Concatenation of Strings */
    val start = "Hello"
    val middle = " "
    val end = "World!"

    println(start + middle + end)

    /** Assignment Operators */
    var number = 12
    number *= 5

    println("number = $number")

    /** Unary Operators */
    var a = 1
    var b = true
    var c = 1

    var resultNumber: Int
    var resultBoolean: Boolean

    resultNumber = -a
    println("-a = $resultNumber")

    resultBoolean = !b
    println("!b = $resultBoolean")

    --c
    println("--c = $c")

    /** Comparison and Equality Operators
     *  코틀린은 3항 연산자 대신 if문을 사용함
     * */
    val d = -12
    val e = 12

    var max = if (d > e) {
        println("a is larger than b.")
        d
    } else {
        println("b is larger than a.")
        e
    }

    println("max = $max")

    /** Logical Operators */
    val f = 10
    val g = 9
    val h = -1
    val resultB: Boolean

    resultB = (f > g) && (g > h)
    println(resultB)

    /** in Operator */
    val numbers = intArrayOf(1, 4, 42, -3)

    if (4 in numbers) println("numbers에 4가 포함됨")

    /** Index access Operator */
    val numbersB = intArrayOf(1, 2, 3, 4, -1)
    println(numbersB[1])
    numbersB[1] = 12
    println(numbersB[1])


}