public class InsertionSortAttempt {
    public static void insertionSort(int[] array) {
        for (int index = 1; index < array.length; index++) {
            int currentValue = array[index];
            int elementToLeft = index - 1;
            while (elementToLeft >= 0 && array[elementToLeft] > currentValue) {
                array[elementToLeft + 1] = array[elementToLeft];
                elementToLeft--;
            }
            array[elementToLeft + 1] = currentValue;
        }

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }

    public static void main(String[] args) {
        // Parse command line arguments as integers
        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        // Call insertionSort method with the input array
        insertionSort(array);
    }
}
