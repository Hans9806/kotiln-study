package z_excercise

/*
### 문제 3: 다중 인터페이스 디폴트 메서드 사용 구현

요구 사항:
1. `Printable`과 `Scannable` 두 인터페이스를 생성하세요.
   - `Printable`에는 `printDocument()` 메서드가 있으며, "문서를 출력합니다."을 출력합니다.
   - `Scannable`에는 `scanDocument()` 메서드가 있으며, "문서를 스캔합니다."을 출력합니다.
2. `MultifunctionPrinter` 클래스를 생성하여 두 인터페이스를 모두 구현하세요.
3. 메인 함수에서 `MultifunctionPrinter`의 `printDocument()`와 `scanDocument()`를 호출하여 결과를 확인하세요.

-- main 예시

fun main() {
    val printer = MultifunctionPrinter()
    printer.printDocument()
    printer.scanDocument()
}

-- 출력 예시

문서를 출력합니다.
문서를 스캔합니다.
 */
interface Printable {
    fun printDocument() {
        println("문서를 출력합니다.")
    }
}
interface  Scannable {
    fun scanDocument() {
        println("문서를 스캔합니다.")
    }
}
class MultifunctionPrinter():Printable,Scannable {

}

fun main() {
    val printer = MultifunctionPrinter()
    printer.printDocument()
    printer.scanDocument()
}