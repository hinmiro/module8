package Stream.Task02;


import java.util.Arrays;
import java.util.function.Consumer;

public class NumberFilter {
    private static int[] list = {4, 2, 5, 7, 2, 9, 7, 8, 3, 1, 5, 3, 6};

    public static void main(String[] args) {
        System.out.println(Arrays.stream(list).filter(i -> i % 2 != 0).map(i -> i * 2).sum());
    }
}
