package h_exception

import java.io.BufferedReader
import java.io.FileReader

fun readFile() {
    // 예외 떠넘기기가 된 Exception을 처리하지 않아도 됨.
    // 코틀린에서는 모든 예외가 Unchecked Exception
    val reader = BufferedReader(FileReader("README.md"))
    val line = reader.readLine()
    println(line)
    reader.close()
}
fun main() {
    readFile()
}