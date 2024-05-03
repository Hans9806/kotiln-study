package o_data.ex1

enum class DayOfWeek(val isWeekend: Boolean) {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);


    fun printDayOffType() {
        if (isWeekend == true) {
            println("주말입니다~")
        } else {
            println("평일입니다..")
        }
    }

    fun recommendActivity(day: DayOfWeek) {
        when (day) {
            MONDAY -> println("공부하기")
            TUESDAY -> println("쇼핑하기")
            WEDNESDAY -> println("맛집가기")
            THURSDAY -> println("휴식하기")
            FRIDAY -> println("운동하기")
            SATURDAY -> println("산책하기")
            SUNDAY -> println("책 읽기")
        }
    }
}

fun main() {
    val day = DayOfWeek.SATURDAY
    day.printDayOffType()
    day.recommendActivity(day)
}