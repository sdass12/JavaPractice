package Lambda;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateAndOrNegateIsEqualExample {
    public static void main(String[] args) {
        IntPredicate predicateA = a -> a % 2 == 0;  //2의 배수인지 검사
        IntPredicate predicateB = b -> b % 3 == 0;  //3의 배수인지 검사

        IntPredicate predicateAB;
        boolean result;

        //and()
        predicateAB = predicateA.and(predicateB);
        result = predicateAB.test(9);  //9가 2와 3의 배수인지 검사
        System.out.println(result);

        //or()
        predicateAB = predicateA.or(predicateB);
        result = predicateAB.test(9); //9가 2 또는 3의 배수인지 검사
        System.out.println(result);

        //negate()
        predicateAB = predicateA.negate();
        result = predicateAB.test(9); //9가 홀수인지 검사
        System.out.println(result);

        //isEqual()
        Predicate<String> predicate;

        predicate = Predicate.isEqual(null);
        System.out.println("null,null is equal : " + predicate.test(null) );

    }
}
