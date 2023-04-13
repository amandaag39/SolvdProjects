import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[100];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }

        System.out.println("Initial Array: ");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\nSorted Array: ");
        printArray(numbers);
    }

    private static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        // account for the step in recursion where inputLength will be 1 element long
        if (inputLength < 2) {
            return;
        }

        //now divide array into two arrays using midIndex
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex]; //this accounts for initial arrays with odd number of elements

        //populate leftHalf with elements from larger input array
        for (int i = 0; i < midIndex; i++) {
            //copy elements from original array into leftHalf
            leftHalf[i] = inputArray[i];
        }

        //populate rightHalf with elements from the larger input array
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        //mergeSort each half of the array
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //Merge leftHalf and rightHalf together into larger sorted array
        merge(inputArray, leftHalf, rightHalf);
    }
    //this method will help merge the leftHalf and rightHalf of array
    private static void merge (int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        // need three iterators--one for the original array (i), leftHalf(j), and rightHalf(k)
        int i = 0, j = 0, k = 0;

        //loop until we run out of elements on either side
        while (i < leftSize && j < rightSize) {
            // compare the values of each half to sort
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            }
            else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            // to set next value of sorted larger array
            k++;
        }
        //clean up! add any straggler elements to final array
        while(i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
