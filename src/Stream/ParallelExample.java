package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "홍길동", "신용권", "김자바",
                "람다식", "박병렬"
        );

        //순차 처리
        Stream<String> stream = list.stream();
        stream.forEach(ParallelExample::print); // s -> ParallelExample.print(s) 와 동일함.

        System.out.println();

        //병렬 처리
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExample::print);
    }

    public static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }

    /* 결과
    홍길동 : main
    신용권 : main
    김자바 : main
    람다식 : main
    박병렬 : main

    김자바 : main
    신용권 : ForkJoinPool.commonPool-worker-1  //parallelStream()을 이용해서 ForkJoinPool(스레드풀)과 main스레드가 병렬적으로 처리함.
    홍길동 : ForkJoinPool.commonPool-worker-1
    박병렬 : ForkJoinPool.commonPool-worker-1
    람다식 : ForkJoinPool.commonPool-worker-1
    */

}
