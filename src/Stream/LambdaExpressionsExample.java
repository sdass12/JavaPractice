package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class LambdaExpressionsExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동",90),
                new Student("신용권",92)
        );

        Stream<Student> stream = list.stream(); //Stream 얻기(stream 안에 Student의 정보들이 들어감)
        stream.forEach( s -> {  // Student s = new Student(); 와 같음.
            System.out.println(s.getName() + " - " + s.getScore());  //Student 클래스에 있는 getName()과 getScore()를 통해 이름과 점수를 받아 와서 출력.
                });
    }
}


class Student{
    private String name;
    private int score;

    public Student(String name, int score){
        this.name=name;
        this.score=score;
    }

    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
}