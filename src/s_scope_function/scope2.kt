package s_scope_function

fun main() {
    // 1. let
    // let을 사용하면 null 체크를 간소화시킬 수 있음.

    val name: String? = null
    // name : 수신객체, 블록 내부에서 수신 객체를 가리키는 키워드는 it
    val length = name?.let {
        println("내 이름은 ${it} 입니다.")
        it.length       // 마지막 행에 있는 경우 리턴 값
    } ?: 0
    println("length = ${length}")

    // scope.function 사용하지 않은 경우
    var name2: String? = null
    val length2 = if (name != null) {
        println("내 이름은 ${name} 입니다.")
        name.length
    } else {
        0
    }
    println("length2 = ${length2}")

    // 2. run
    // 수신객체 this
    // 수신 객체에서 하나 이상의 작업을 수행할 때 사용
    val result = "코틀린".run {
        println("수신 객체의 길이는 ${this.length} 입니다.")
        this.length     // 마지막 행 리턴 값
    }
    println("result = ${result}")

    // run을 사용하지 않는 경우
    val runName = "코틀린"
    println("길이는 ${runName.length} 입니다.")
    val result2 = runName.length


    // 3. apply
    class Person {
        var name = ""
        var age = 0
    }
    // 반환 값으로 수신객체 자체를 리턴
    // this 키워드로 수신 객체에 접근
    // 객체 포로퍼티 설정한거나 초기화할 떄 줄 사용.
    val person = Person().apply {
        this.name = "홍길동"       // 중복 변수명이 있을 경우 this
        age = 30    // 수신 객체 내부에서 this 키워드 생략하여 속성에 접근 가능
    }
    println("person = ${person}")

    // apply 사용하지 않은 경우
    val person2 = Person()
    person2.name = "홍길동"
    person2.age = 30

    // 4. also
    // 객체에서 부수적인 작업을 수행할 때 사용
    val mutableList = mutableListOf(1, 2, 3).also {
        println("리스트: ${it}")       // it으로 수신객체 접근
        it.add(4)
        // 수신 객체 자체를 리턴
    }
    println("mutableList = ${mutableList}")

    // 사용하지 않는 경우
    println("리스트 : ${mutableList}")
    mutableList.add(5)


    // 5. with
    val sb = StringBuilder()
    val str = with(sb) {
        // 내부 수신 객체는 this 또는 생략하여 접근
        append("안녕하세요")
        append("여기는 스콥 함수 내부입니다.")
        append("수신 객체가 하는일을 편하게 해주고")
        append("메서드 체이닝처럼  해줘요")
        toString()  // 마지막 람다행을 리턴값으로 반환
    }

    println("str = ${str}")

    // with 사용하지 않은 경우
    val builder = StringBuilder()
    builder.append("안녕하세요")
    builder.append("반갑습니다")
    val str2 = builder.toString()
}