package m_object

interface Printable {
    // 인터페이스 구현 등의 확장 가능
    fun print()
}

class Printer {
    companion object : Printable {
        override fun print() {
            println("컴패니언 객체에서 프린트합니다.")
        }
    }
}

fun main() {
    Printer.print()     // 클래스에서 interface 메서드 호출
}