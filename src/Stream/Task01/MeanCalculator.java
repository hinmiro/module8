package Stream.Task01;

import java.util.ArrayList;
import java.util.Arrays;

public class MeanCalculator {
    private static final int[] list = {2, 4, 1, 6, 4, 2, 9, 8, 4, 6, 8};
    private static final ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 6, 2, 3, 6, 4, 3, 2, 1, 9, 8, 5, 7, 6));

    public static void main(String[] args) {
        System.out.printf("%.2f%n", list2.stream().mapToInt(i -> i).average().getAsDouble());
        // Tai
        System.out.printf("%.2f%n", Arrays.stream(list).average().getAsDouble());
    }
}
