import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{4, 6, 8, 3, 2, 6, 0, 9};
        System.out.println(Arrays.toString(array));
        new BubbleExample().bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}