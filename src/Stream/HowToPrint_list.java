package Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class HowToPrint_list {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c");


        ////////////////////////////////////////////////////////


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("======================================");  //for문으로 출력(3줄)

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("======================================");  //Iterator를 이용해 출력(4줄)

        Stream<String> stream = list.stream();
        stream.forEach(str -> System.out.println(str));

        System.out.println("======================================");  //Stream, 람다식을 이용해 출력(2줄)
    }
}
