package Thread;

public class MainThreadExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();
        System.out.println("User1 스타트 됨.");

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();
        System.out.println("User2 스타트 됨.");
    }
}
