package i_function
/*
### 연습문제 3: 온도 변환기

#### 문제 설명
섭씨 온도를 화씨 온도로 변환하는 함수를 작성하세요. 사용자로부터 섭씨 온도를 입력받고, 화씨 온도로 변환한 결과를 출력합니다.

#### 요구사항
- 함수 이름은 `convertCelsiusToFahrenheit`로 하세요.
- 섭씨 온도는 `Double` 타입으로 입력받으세요.
- 화씨 온도 변환 공식은 `(섭씨온도 * 9/5) + 32` 입니다.
- 결과는 소수점 두 자리까지 출력하세요.
- 단일행 함수로 작성하세요.

 */
fun convertCelsiusToFahrenheit (gc: Double): Double  = (gc * 9/5) + 32

fun main() {
    val celsius = 25.0
    val fa = convertCelsiusToFahrenheit(celsius)
    println("${celsius}도 섭씨 온도는 %.2f도 화씨 온도입니다.".format(fa))
}