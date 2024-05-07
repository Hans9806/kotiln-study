# 코틀린

## 코틀린 언어 소개
- JetBrains 사 에서 오픈소스 그룹을 만들어 개발한 프로그래밍 언어
- 2011년에 개발되고 2016년에 정식 출시
- 자바를 대체할 목적으로 만들어진 언어
  - 자바 : 코드 장황하고 복잡함, 설계, null 다루는 문제 
    - 해당 단점을 개선하고자 만든 언어.
  - 코틀린의 특징
    - 간결한 코드
    - 안전한 코드
    - 자바와 100% 호환
    - 함수형 프로그래밍 지원
- Android 개발사 구글이 2017년에 안드로이드 공식언어로 코틀린을 추가
- 2019년부터 Kotlin First 를 선언하며 공식문서 샘플코드를 Java -> Kotlin 우선으로 변경
  - 이후 구글에서 작성하는 안드로이드 프로젝트는 Kotlin 으로 작성

  - 코틀린에 대한 조각 지식
    - 코틀린은 정적 타입 언어
    - 무료 오픈 소스 아파치 2.0 라이센스 : 상업적 이용에 제한을 두고 있지 않음.
    - 확장자는 kt 이다.
    - 자바와 다르게 문장의 끝에 세미콜론을 붙이지 않아도 된다.
    - 주석 처리 방법은 자바와 동일.
    - 별도의 접근제한자를 붙이지 않으면 모두 public 이다.
    - 함수는 fun 이라는 키워드를 사용한다.
    - 자바에서는 '타입 변수명'이지만, 코틀린에서는 '변수명 : 타입'으로 선언
    - 변수나 함수 클래스 모두 Top-Level(최상단)에 선언 가능

## 변수 선언
1. val (Value)
   - java 의 final 키워드와 유사
   - 불변(immutable) 변수, 한 번 초기화하면 값을 변경할 수 없음.
2. var (Variable)
   - 가변(mutable) 변수
   - 초기화 후에도 값을 변경할 수 있음.
   - 값이 업데이트 되어야 하는 경우에 var 를 사용함.
- 타입을 명시적으로 작성하지 않아도 초기화된 값을 기준으로 타입을 추론
- 만약 초기값을 작성하지 않는 경우는 반드시 명시적으로 타입을 작성해야 함.
- 모든 변수는 우선 val로 만들고 업데이트가 필요한 경우 var을 사용함.

## 코틀린의 타입
- 자바의 primitive Type에 해당하는 Basic Type 기본 타입
- 일반 클래스(포장 클래스)처럼 보이는 (ex. Int) 형태로 작성되지만
내부적(컴파일 단계)으로는 primitive Type으로 처리 됨
- 객체를 인스턴스화할 때 new 키워드를 붙이지 않는다
- Java에서처럼 자동 프로모션 캐스팅은 되지 않는다.
  - 명시적으로 타입을 변환해줘야 함. 변수명.toType() ex) number.toLong()
- 타입 체크
  - java에서 `instanceOf` 로 타입확인
  - is로 체크되어 true가 된 타입은 스마트 캐스팅되어 해당 클래스 사용 가능
- 코틀린의 특수 타입
  1. Any - 모든 객체의 최상위 타입
  2. Unit - Java의 void에 해당, 리턴값이 없음, 생략 가능.
  3. Nothing - 함수가 정상적으로 끝나지 않음
- 문자열 템플릿
  - 문자열 내부에 ${변수명}, ${표현식} 등으로 사용가능
  - 가독성 높은 깔끔한 코딩 가능

## 연산자
- 기본적인 단항, 산술, 대입 연산자는 Java와 동일
- 비교 연산자: 객체 간의 비교 연산자 사용이 가능 (Comparable 인터페이스 구현시)
- 동등성 비교 : `==` (java의 equals)
- 동일성 비교 : `===` (java의 `==`)
- 특수 연산자
  1. in : 컬렉션이나 범위에 포함됨
  2. a..b : a부터 b까지의 범위 1..100
  3. a[i] : 특정 인덱스의 값을 가져옴
  4. a[i] = b : 특정 인덱스의 값을 가져옴

## 제어문
1. if문
   - 기본적으로 Java와 동일함
   - 자바에서 if-else는 Statement, 코틀린에서는 Expression
2. when문
   - Java의 switch - case 의 확장
   - 여러개의 조건이나 타입, 범위, 클래스와 조합해서 사용 가능
3. for문
   - for-each 문 : for (number in numbers)
   - 기본 for 문 : for (i in 1..100)
     - 등차수열 방식으로 step, downTo로 스텝, 역순 등을 조정할 수 있음
4. while문
   - Java와 동일

## null 안전성
- 코틀린의 변수는 기본적으로 null을 허용하지 않는다
  - 잠재적인 NPE 문제에 대해서 안전성을 갖춤.
1. nullable(Type?) null 값이 필요한 경우 명시적으로 선언
2. safe Call(?.) null 값이 포함될 수 있는 속성이나 함수는 안전 호출
3. elvis operator(?:) null 값이 감지될 경우 어떻게 할지 선언
4. 단언 연산자(!!) 강제로 null 안전하다고 선언

## 예외처리
- Checked Exception : 컴파일 시점 처리를 강제하는 예외
- Unchecked Exception : 런타임에 발생하는 예외
- 코틀린은 자바돠 다르게 모든 예외가 Unchecked Exception
- 예외 발생 코드를 최소화하고, 발생 가능성 있는 예외는 적절하게 처리

## 함수
- 선언문법
  ```
  접근지시어 fun 함수이름(매개변수): 리턴타입 {}
  ```
- 단일표현식 : 함수가 한 줄일때는 중괄호와 리턴 생략 `=`으로 대입
- 기본매개변수 : 매개변수에 기본값 설정 가능, (Java의 오버로딩 효과)
- 이름있는인자 : 호출할 떄 인자에 파라미터 이름 지정 가능 (자유로운 순서)
- 가변인자 : vararg 키워드로 같은 타입의 매개변수 입력 가능

## 클래스
- 코틀린은 클래스의 데이터를 저장하는 변수를 `필드`가 아닌 `프로퍼티`라고 부름
- `프로퍼티(Property)`
  - 프로퍼티는 필드와 게터와 세터를 포함하는 개념.
  - 프로퍼티 = 필드 + 게터 + 세터
  - 코틀린에서는 게터와 세터를 선언하지 않아도 접근자(.)를 통해 호출 가능
  - var 로 선언 : 가변 프로퍼티(읽기, 쓰기 가능) getter, setter
  - val 로 선언 : 불변 프로퍼티(읽기 가능) getter
- `생성자(constructor)`
  - constructor 키워드(생략가능) 클래스 선언부에 주생성자를 선언
  - 코틀린에서는 주 생성자가 필수
  - 초기화 블록(init)과 부 생성자(constructor)를 추가로 만들 수 있음
  - 부생성자에서는 주 생성자를 호출해야 함
- 커스텀 게터, 커스텀 세터
  - 필드 아래에 get(), set() 블록을 만들어 게터, 세터 로직을 추가할 수 있음
- Backing Field : 프로퍼티의 값을 실제로 저장하는 변수
  - 접근자 메서드 내에서 `field` 키워드 사용

## 상속
- 코틀린에서는 자바와 다르게 상속(extends) 구현(implements) 시 `:` 키워드를 사용한다.
- 코틀린의 모든 클래스는 기본적으로 `final`(상속 불가) 상태이다.
- `open` 키워드 : 상속을 허용하기 위해 사용
- `override` 키워드 : 메서드 오버라이드시 필수적으로 사용
- `abstract` 키워드 : 추상 클래스나, 추상 메서드 선언 시 사용,
  상속받는 클래스나 오버라이딩 되는 메서드에 별도의 open 키워드 불필요
- 컨벤션(관례) : 상속 구현 사용시 ` : ` 콜론 앞에 공백을 두는 관례가 있음 (타입과 구분을 위해)
- 상속을 받을 떄 부모 클래스의 생성자를 호출해야 함

## 인터페이스
- 인터페이스는 하나 이상의 추상 메서드를 포함할 수 있음(추상 메서드 = 본문없는 메서드)
- 디폴트 메서드 : 인터페이스에서 메서드가 본문을 가지는 경우
- 코틀린에서는 디폴트 메서드 구현을 포함할 수 있음.
- 인터페이스는 다른 인터페이스 상속 가능
- 한 클래스는 여러 인터페이스 상속 가능

## 가시성(Visibility) 제어
- Java : public, protected, (default), private
- Kotlin : (public), protected, internal, private
- 자바의 기본값은 default, 코틀린의 기본값은 public

- 코틀린
  - public : 모든 곳에서 접근 가능
  - protected : **선언된 클래스** 또는 하위 클래스에서만 접근 가능 
               (파일 최상단에서는 사용 불가능)
  - internal : 같은 **모듈**에서만 접근 가능
  - private : 선언된 클래스에서만 접근 가능
              (같은 파일 내에서만 접근 가능)

- 자바
  - public : 모든 곳에서 접근 가능
  - protected : 같은 패키지 또는 하위 클래스에서만 접근 가능
  - default : 같은 패키지에서만 접근 가능
  - private : 선언된 클래스에서만 접근 가능

- 모듈
  - 함께 컴파일되는 파일(코틀린)들의 집합
  - Intellij IDEA 모듈
  - 메이븐 프로젝트 단위
  - Gradle Source Set
- 각각의 모듈은 독립적으로 컴파일됨.
- 각 모듈은 자체적인 종속성을 가지고, 각각의 설정을 가질 수 있음.
- `internal` 접근제어자는 모듈 내에서는 자유롭게 사용하지만 라이브러리나 
애플리케이션 단위에서는 내부 구현을 숨길 수 있음.

## object 키워드
- `companion object` : java의 `static` 키워드에 대응하는 개념
  - 클래스 내부에 static 멤버를 정의할 때 사용
  - companion object 는 하나의 객체로 간주되기 떄문에 다른 타입을 상속, 구현 받을 수 있음.
- `object` 키워드를 사용해서 만든 클래스는 싱글톤 클래스가 된다.
- 익명 객체를 만들 때는 `object: 타입이름`을 사용한다.

## 중첩클래스
1. 중첩클래스 (Nested Class)
   - 자바의 static 중첩 클래스와 유사하게 동작
   - 외부 클래스의 인스턴스에 대한 참조가 없음.
   - 기본적으로 바깥 클래스를 참조하지 않음 (권장사항)
2. 내부클래스 (Inner Class)
   - 자바의 static 키워드가 없는 클래스와 유사하게 동작
   - 외부 클래스의 인스턴스와 연결되어 있음.
   - 바깥 클래스를 참조하려면 `inner` 키워드 사용
   - 이름이 같은 바깥 클래스 참조하려면 `this@OuterClass` 사용

## data class
- 클래스 앞에 `data`키워드를 선언하여 사용
- 자동으로 equals(), hashCode(), toString() 등이 구현
- copy()메서드 componentN() 메소드가 생성
- 구조분해 선언 사용 가능
- 데이터 보관 목적으로 사용되는 클래스의 보일러플레이트 코드 자동 생성
- VO, DTO 등에 효율적으로 사용
- **주의사항**
  - data class는 최소 한 개의 매개변수가 있는 주 생성자가 필요
  - data class는 상속을 할 수 없음, 인터페이스 구현 가능
  - `abstract`, `open`, `inner` 등의 키워드 사용할 수 없음
## enum class
- 고정된 상수 집합
- 각 항목이 enum 클래스의 인스턴스로 존재
- 정해진 값들 중에서만 선택할 수 있도록 강제
- 프로퍼티와 메서드를 가질 수 있다.
- when 문과 함께 사용하게 될 경우 모든 경우를 처리할 수 있게 컴파일러가 항목 검사
- 누락된 항목이 없도록 컴파일 시점에 알게 됨 => 타입 안전성
- 단순하고 고정된 선택지가 필요할 때 사용

## sealed class
- 같은 패키지 내부에서만 하위 클래스 상속이 가능
- 컴파일 시 하위 클래스의 타입을 모두 기억
- 제한적으로 상속하고 유연하지만 제어된 확장을 가능하게 함.
- when 문과 함께 사용시 모든 경우가 처리되었는지 컴파일 시점에 확인
- 상태에 따른 특정 로직을 구현할 때 유용

## 확장 함수 (extension function)
- 기존 클래스에 새로운 메서드를 추가할 수 있는 기능을 제공
- 기존 소스코드를 수정하지 않고, 새로운 함수를 `확장`
- 실제로는 클래스의 객체를 매개변수로 받는 static 메서드를 추가하는 ㅏ
- `this` 키워드를 통해 수신 객체의 참조에 접근 불가
    ```kt
  fun 확장하고싶은클래스.추가할함수이름(매개변수) : 리턴타입 {
        // this로 클래스의 객체에 접근
    }
    ```

- 주의 사항
  1. 이름이 같을 경우 항상 멤버함수가 우선된다.
  2. 오버라이딩 되지 않고, 변수의 타입에서 호출 함수가 결정된다.
- `확장 프로퍼티`
  - 기존 클래스나 인터페이스에 새로운 프러퍼티를 추가
  ```kt
    val 확장하려는케이스.추가하려는프로퍼티이름: 프로퍼티타입
            get() = 로직
  ```

## infix 함수 (중위 함수)
- 메서드의 호출을 `infix`키워드를 통해
- 자연스러운 방식으로 표현할 수 있게하는 문법 기능
- 두 개의 파라미터, 하나는 메서드의 수신 객체, 하나는 인자
- 중위 함수는 반드시 하나의 매개변수를 가져야 함.
- 자연 언어에 가까운 코드 스타일을 만들 수 있음.

## inline 함수
- 함수 성능 최적화를 위해 사용되는 함수
- `inline` 키워드가 있으면 함수 호출하는 대신 함수 본문으로 대체함
- (내부적으로) 새로운 객체가 생성되거나, 함수가 호출이 되는 방식이 아니기 때문에
- 메모리 간접 비용과 성능 비용을 줄임.
- 람다 표현식을 매개변수로주로 사용함.
- 코드가 호출지점에 복제 됨.

## 지역 함수 (local function)
- 다른 함수 내부에 정의된 함수
- Java의 경우 함수 내부에 함수를 정의할 수 없음
- Kotlin은 함수 안에 함수를 사용할 수 있으며, 자신이 정의된 함수 내부에서만 사용할 수 있음
- 코드를 블럭화 시키고, 밀접하게 연관된 로직을 여러번 내부에서 사용헤야 될 경우,
 주요 로직과의 분리가 필요할 경우 사용할 수 있다.

## 람다 (함수형 프로그래밍, FP)
- First-Class Citizen (일급 시민, 일급 객체)
  - 프로그래밍 언어에서 특정한 개체가 동일한 조건으로 다루질 수 있는 것을 의미
    1. 변수에 할당될 수 있음
    2. 함수의 인자로 전달될 수 있음
    3. 함수의 결과로 반환될 수 있음
    4. 런타임 시에 생성될 수 있음
  - 자바에서는 함수(Function)이 일급 시민이 아닌 2급 시민
  - 변수에 할당되거나, 매개변수로 전달되거나 리턴값으로 받을 수 없었음.
  - 코틀린에서는 함수가 그 자체로 값이 되고, 변수에 할당하고, 매개변수로 넘기고, 리턴값으로 받을 수 있음.

- 고차 함수 (Higher Order Function)
    - 함수의 인자로 함수를 전달하거나, 함수의 결과로 함수를 반환하는 함수
    - 함수라는 개체가 일급 시민일 때 가능한 함수
    - 함수형 프로그래밍 패러다임을 가능하게 함

- 람다 표현식(Lambda Expression)
    - 고차 함수에 인자로 정달되거나 결과로 반환될 수 있는
    - 익명 함수를 간결하게 표현한 문법
    - 코틀린에서 람다 표현식은 `{}` 안에 정의
    - `{ 매개변수 -> 코드 본문 }`
    - 매개변수 : 람다로 전달되는 입력값
      - 매개변수가 없을 경우에 생략 가능
      - 매개변수가 하나일 경우 생략하고 it 키워드로 대체 가능
    - 화살표(->) : 파라미터와 코드 본문 구분.
      - 매개변수가 없거나 하나일때 생략 가능
    - 코드본문 : 람다 실행 코드블럭
      - 본문의 마지막 줄의 표현식(expression)이 리턴값

- 클로저
  - 람다 표현식이나, 익명 함수가 외부 범위에 있는 변수를 캡쳐해서 참조할 수 있는 기능.
  - 캡쳐된 변수는 해당 범위(scope)를 벗어나더라도 캡쳐된 변수에 접근하고 조작할 수 있음.
  - Closure : 람다가 시작되는 지점에 참조하고 있는 변수를 모두 캡처하여 정보를 가짐

## 컬렉션 프레임워크 함수형 프로그래밍
1. map : 변환
2. filter : 추출
3. reduce : 누적연산
4. sortedBy : 정렬
5. groupBy : 그룹화 (Map으로 반환)
6. all / none / any : 요소를 조건식으로 Boolean 반환

## Scope function
- 일시적인 영역(Scope)을 형성하는 함수
- 람다 표현식 내부에 수신 객체에 쉽게 접근할 수 있는 방법을 제공
- 종류
  1. let : 수신객체 it, 리턴값 -> 람다블록의 결과값(마지막행)
  2. also : 수신객체 it, 리턴값 -> 수신 객체 자체 
  3. run : 수신객체 this, 리턴값 -> 람다블록의 결과값(마지막행)
  4. apply : 수신객체 this, 리턴값 -> 수신 객체 자체
  5. with : 객체를 인자로 받고, this 키워드 , 람다 결과값 리턴

## 자연 초기화(Lazy Initialization)
- 객체나 변수를 실제로 필요할 떄까지 초기화 하지 않는 것
- 초기화 시점을 미룰 수 있고, 메모리 리소스를 절약할 수 있음

1. lateInit
    - 프로퍼티 타입 : var(가변)
    - 타입 제한 : 기본타입(Primitive 타입)과 Nullable 타입 불가
    -  초기화 시점을 정확히 알수 없는 경우 사용
2. lazy
    - 프로퍼티 타입 : val(불변)
    - 타입 제한 : 제한없음
    - 초기화 비용이 은 경우 사용