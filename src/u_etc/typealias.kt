package u_etc

// typealias : 긴 이름에 대하여 별칭 사용하기
typealias StringMap = Map<String, String>
// 긴 타입명에 별칭을 제공

fun printMap(map: Map<String, String>) {    // 별칭 사용
    for ((key, value) in map) {
        println("$key : $value")
    }
}

typealias Operation = (Int, Int) -> Int     // 람다식 타입 별칭

fun runOperation(a: Int, b: Int, operation: Operation): Int {
    return operation(a, b)
}

fun main() {
    val map: StringMap = mapOf("key" to "value", "key2" to "value2")
    printMap(map)
}