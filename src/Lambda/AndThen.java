package Lambda;

import java.util.function.Consumer;

public class AndThen {
    public static void main(String[] args) {
        Consumer<Member> consumerA = (m) -> {
           System.out.println("consumerA : " + m.getName());
        } ;

        Consumer<Member> consumerB = (m) -> {
            System.out.println("consumerB : " + m.getId());
        } ;

        Consumer<Member> consumerAB = consumerA.andThen(consumerB); //A를 실행한 후 B를 실행 함.
        consumerAB.accept(new Member("홍길동","hong",null));
    }
}
