package m_object;

public class CounterJava {
    public static int count = 0;    // 같은 클래스의 모든 객체가 공유

    public CounterJava() {
        count++;
    }
}

