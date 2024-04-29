package b_type

fun main() {
    val obj: Any = "문자열"

    // is 연산자 : 객체가 특정타입의 인스턴스인지 검사하고 결과를 true / false 으로 리턴
    if (obj is String) {
        // is의 검사가 참일 경우 별도로 캐스팅할 필요가 없음.
        // 스마트 캐스팅 Any -> String
        println(obj.startsWith("문"))
        // String 타입에서 쓸 수 있는 메서드 등을 사용할 수 있음
    } else {
        // is의 검사가 false 인 경우에는 캐스팅하지 않음
        // obj.length   // 컴파일 에러
    }

    // 반대의 경우를 검사
    if (obj !is String) {
        // obj.length  // 문자열로 캐스팅하지 않음
    } else {
        obj.length     // 문자열 캐스팅
    }

    // as 연산자 : 강제로 타입을 캐스팅
    val num: Any = 1234     // "1234" 로 바꾸어 실행해보기
    // val numStr = num as String   // ClassCastException 런타임 오류 발생
    // Int -> String

    // as? 연산자 : 안전한 캐스팅
    // 만약 해당 타입으로 캐스팅잉 되지 않을 경우 ClassCastException을 발생시키는 대신
    // null 을 리턴
    val safeNumStr = num as? String
    println("캐스팅결과: " + safeNumStr)
}