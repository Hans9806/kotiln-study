package g_null_saftey

fun main() {
    // 엘비스 연산자(`?:` : null값이 감지될 경우 어떻게 할지 선언
    val name:String? = null
    val safeName = name ?: "이름없음"
    println(safeName)

    val str:String? = null     // ? nullable
    // ?. saftey call  ?: elvis
    println("문자열의 길이 : ${str?.length ?: 0}")

    // null이 아닌경우 str.length
    // null인 경우 str =>(safety call) null =>(elvis) 0

    // 함수 리턴값으로 활용
    fun getLength(str:String?): Int {
        return str?.length ?:0
    }
    // null 처리 로직을 간결하고 가독성 좋게 처리할 수 있음

    // null 일 경우 예외 발생시키기
    val input: String? = null
    val result:String = input ?: throw IllegalArgumentException("널을 입력하지 마세요")
}