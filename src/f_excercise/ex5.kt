package f_excercise

/*
### 연습문제5: 할인 요금 계산하기

문제:
영화관에서 요일에 따라 다른 할인율을 적용합니다.
사용자가 영화를 보러 가는 요일을 입력받아 할인된 가격을 계산하는 프로그램을 작성하세요.
평일(월요일부터 목요일)은 10% 할인, 주말(금요일부터 일요일)은 20% 할인이 적용됩니다.

요구사항:
- 변수 `dayOfWeek`를 선언하고, 사용자가 입력한 요일을 할당하세요. 입력은 "Monday", "Tuesday", ..., "Sunday"의 형태로 가정합니다.
- 변수 `originalPrice`를 선언하고, 티켓의 원래 가격으로 12,000원을 할당하세요.
- `if` 표현식을 사용하여 할인된 가격을 계산하고 출력하세요.

실행 예시:
```
Monday
할인된 가격은 10,800원입니다.
```
 */
fun main() {
    println("영화보러가는 요일을 입력하세요 (입력은 \"Monday\", \"Tuesday\", ..., \"Sunday\") 의 형태로 가정합니다.")
    val dayOfWeek = readLine()
    val originalPrice: Int = 12000

    var discountPrice =
        if ((dayOfWeek == "Friday") || (dayOfWeek == "Saturday") || (dayOfWeek == "Sunday")) {
            var week = (originalPrice * 0.8).toInt()
            println("할인된 가격은 ${week}원입니다")
        } else {
            var week2 = (originalPrice * 0.9).toInt()
            println("할인된 가격은 ${week2}원입니다")
        }
}