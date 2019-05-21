package Thread;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }
            //setMemory 메소드를 잠궈서 한 쓰레드가 실행하는 동안 다른 쓰레드가 실행을 못 시키게 막음.
    public /*synchronized*/ void setMemory(int memory) {
        this.memory = memory;

        try{
            if(Thread.currentThread().getName().equals("User1")) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            }else{
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName());
            }
        }catch(Exception e){}
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);


    }


}
