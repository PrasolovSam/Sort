public class BubbleExample {

    public void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                int previous = array[i - 1];
                int current = array[i];
                if (previous > current) {
                    swap(array, i - 1, i);
                    isSorted = false;
                }
            }
        }
    }

    private void swap(int[] array, int index1, int index2) {
        int buffer = array[index1];
        array[index1] = array[index2];
        array[index2] = buffer;
    }
}
