package Stream;


import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", Member.MALE, 30),
                new Member("김나리", Member.FEMALE, 20),
                new Member("신용권", Member.MALE, 45),
                new Member("박수미", Member.FEMALE, 27)
        );

        double ageAvg = list.stream()
                .filter(m -> m.getGender()==Member.MALE) //gender가 MALE인 값들로만 필터링시킴.
                .mapToInt(Member :: getAge)  //Int 값들을 getAge()를 통해서 받아옴
                .average() //값들을 평균으로 바꿔줌.
                .getAsDouble(); //Int형을 Double형으로 형변환시킴.

        System.out.println("남자 평균 나이 : " + ageAvg);
    }
}

class Member {
    public static int MALE = 0;
    public static int FEMALE = 1;

    private String name;
    private int gender;
    private int age;

    public Member(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}