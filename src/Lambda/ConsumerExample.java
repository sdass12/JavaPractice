package Lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {  //매개변수만 있고 리턴이 없을 때 사용
    public static void main(String[] args) {
        Consumer<String> consumer = t -> System.out.println(t + "입니다.");  //매개변수가 하나
        consumer.accept("java");

        BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + "입니다."); //매개변수가 복수
        bigConsumer.accept("java","입니다.");
    }
}
