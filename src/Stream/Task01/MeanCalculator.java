package Stream.Task01;

import java.util.ArrayList;
import java.util.Arrays;

public class MeanCalculator {
    private static int[] list = {2, 4, 1, 6, 4, 2, 9, 8, 4, 6, 8};
    private static ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 6, 2, 3, 6, 4, 3, 2, 1, 9, 8, 5, 7, 6));

    public static void main(String[] args) {
        System.out.println(String.format("%.2f", list2.stream().mapToInt(i -> i).average().getAsDouble()));
        // Tai
        System.out.println(String.format("%.2f",Arrays.stream(list).average().getAsDouble()));
    }
}
