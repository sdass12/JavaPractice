package Lambda;

public class Calculator {
    public static int staticMethod(int x, int y) {  //정적 메소드
        return x + y;
    }

    public int instaceMethod(int x, int y){  //인스턴스 메소드
        return x + y;
    }
}
