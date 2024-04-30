package i_function

import java.util.*

fun calculateAverage1(vararg grades: Int): Double {
    println(Arrays.toString( grades ))
    return grades.sum().toDouble() / grades.size
}

fun greet1(name: String, time: String = "오전"): String {
    return if (time == "오전") "Good morning $name" else "Good afternoon $name"
}

fun convertCelsiusToFahrenheit1(celsius: Double) = (celsius * 9/5) + 32


fun main() {
    // ex1
    val array = arrayOf(90, 80, 100, 70)
    val average = calculateAverage1(*array.toIntArray())
    println("평균 성적은 ${"%.2f".format(average)}입니다." )

    // ex2
    println(greet1("홍길동","오후"))
    println(greet1("임꺽정"))

    // ex3
    print("섭씨 온도를 입력하세요")
    val celsius = readLine()?.toDouble()
    "화씨 온도는 ${(convertCelsiusToFahrenheit1(celsius!!))} 입니다"
}