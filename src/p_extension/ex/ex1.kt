package p_extension.ex

import p_extension.ex.startsWithChar as startsWithChar1

/*
### 확장 함수 만들기

요구사항:
1. `String` 클래스에 `startsWithChar`라는 확장 함수를 추가합니다.
2. 이 함수는 문자 하나를 파라미터로 받고, 문자열이 해당 문자로 시작하는지 boolean 값으로 반환합니다.

실행 예시:
```kotlin
fun main() {
    val text = "kotlin"
    println(text.startsWithChar('k'))  // 출력: true
    println(text.startsWithChar('c'))  // 출력: false
}
```
 */

fun String.startsWithChar(char: Char): Boolean {
    return this.isNotEmpty() && (this.first() == char.toLowerCase())
    // return this[0].lowercase() == char.lowercase()
}
fun main() {
    val text = "kotlin"
    println(text.startsWithChar1('k'))
    println(text.startsWithChar1('s'))
}