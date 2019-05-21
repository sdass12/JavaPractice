package Lambda;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;  //매개변수, 리턴 값이 없는 람다식
        MyFunctionalInterface2 fi2;//매개변수는 있지만 리턴 값이 없는 람다식
        MyFunctinalInterface3 fi3; //매개변수, 리턴 값이 있는 람다식

        fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };
        fi.method();

        fi = () -> {
            System.out.println("method call2");
        };
        fi.method();

        fi = () -> System.out.println("method call3");
        fi.method();

        fi2 = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi2.method1(2);


        fi3 = (x, y) -> {
            int result = x * y;
            return result;
        };
        System.out.println(fi3.method3(2, 3));


        fi3 = (x, y) -> x * y;  //메소드 안에 리턴만 있다면 이런식으로 return문을 생략 가능 (위와 동일한 기능)
        System.out.println(fi3.method3(3, 3));
    }


}
