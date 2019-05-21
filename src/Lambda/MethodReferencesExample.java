package Lambda;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;  //두 개의 int 값을 받아서 int 값을 리턴함.

        //정적 메소드 참조
        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("결과1: " + operator.applyAsInt(1, 2));

        operator = Calculator::staticMethod;  //클래스 :: 메소드
        System.out.println("결과2: " + operator.applyAsInt(3, 4));

        //인스턴스 메소드 참조
        Calculator obj = new Calculator();

        operator = (x, y) -> obj.instaceMethod(x, y);
        System.out.println("결과3: " + operator.applyAsInt(5, 6));

        operator = obj::instaceMethod;  //참조변수 :: 메소드
        System.out.println("결과4: " + operator.applyAsInt(7, 8));
    }
}
