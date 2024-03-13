package Task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Lambada {
    private static ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 5, 8, 20, 15, 3, 12));

    public static void main(String[] args) {
        AtomicInteger sum = new AtomicInteger();
        list.removeIf(i -> i % 2 == 0);
        list.replaceAll(i -> i*2 );
        list.forEach(sum::addAndGet);
        list.forEach(i -> System.out.println(i));
        System.out.println(sum);

    }
}
