package Lambda;

import java.util.function.IntSupplier;

public class SupplierExample {  //매개변수가 없고 리턴 값만 있을 때 사용
    public static void main(String[] args) {
        IntSupplier intSupplier = () -> {
            int num = (int) (Math.random() * 6) + 1;  //1~6까지 난수
            return num;
        };
        System.out.println("눈의 수 : " + intSupplier.getAsInt()); //getAsInt() -> int 값을 리턴
    }
}
