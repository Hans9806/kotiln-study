package o_data

// `sealed` : 봉인된
// 상속이 가능한 클래스를 만들고 싶지만, 외부에서는 상속받지 않으면 좋겠다.
// 정의된 패키지 내부에서만 상속이 가능한 클래스
// 제한된 상속 => 코드의 응집력을 높인다.

sealed class Transport(val name: String, val maxSpeed: Int)

class Car : Transport("아반떼", 180)
class Bus : Transport("타요", 120)
class Bicycle : Transport("씽씽이", 30)

object Tank : Transport("전차", 50)

// when 문에서 모든 가능한 하위 클래스 타입을 컴파일 시점에 체크
fun handleTransport(transport: Transport) {
    when (transport) {
        is Bicycle -> println("${transport.name}가 " +
                "${transport.maxSpeed}km/h 로 도로를 질주합니다.")
        is Bike -> println("${transport.name}가 " +
                "${transport.maxSpeed}km/h 로 도로를 질주합니다.")
        is Bus -> println("${transport.name}가 " +
                "${transport.maxSpeed}km/h 로 도로를 질주합니다.")
        is Car -> println("${transport.name}가 " +
                "${transport.maxSpeed}km/h 로 도로를 질주합니다.")
        Tank -> println("${transport.name}가 " +
                "${transport.maxSpeed}km/h 로 전장을 질주합니다.")
    }
}

fun main() {
    handleTransport(Car())
    handleTransport(Bus())
    handleTransport(Tank)
}