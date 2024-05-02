package m_object

class Counter {
    // 코틀린에는 static 키워드 없음.

    // companion (동반자)
    // 클래스와 동반되는 유일한 오브젝트
    // 일반 인스턴스는 클래스와 별개로 각 멤버 데이터를 갖는다.
    companion object {
        var count = 0       // 공유 프로퍼티
    }

    init {
        count++             // 생성시 마다 증가
    }

}

fun main() {
    val c1 = Counter()
    // println(c1.count)  => 인스턴스 멤버 호출시 사용방법 사용불가(자바에서 사용가능)
    println(Counter.count)  // companion object 의 멤버는 클래스에서 접근

    val c2 = Counter()
    println(Counter.count)
}