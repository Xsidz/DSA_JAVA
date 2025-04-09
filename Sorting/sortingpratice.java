package Sorting;

public class sortingpratice {
    public static void BubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    public static void SelectionSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    public static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i], prev = i - 1;
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void Countingsort(int arr[]) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = Math.max(max, arr[i]);
            }
            if (arr[i] < min) {
                min = Math.min(min, arr[i]);
            }
            
        }

        int range = max-min + 1;
        int countarr[] = new int[range];

        for (int i = 0; i < arr.length; i++) {
            countarr[arr[i]]++;
        }
        int j = 0;

        for (int i = 0; i < countarr.length; i++) {
            while (countarr[i] > 0) {
                arr[j] = i;
                j++;
                countarr[i]--;
            }
        }

        for (int i = 0; i < countarr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 10, 3, 4, 19 };
        // Countingsort(arr);
        if (nums == null || nums.length < 3) {
            System.out.println(0); // Not enough elements to compute the required value
        }

        int max = 0; // Index of max value
        int min = 0; // Index of min value after max
        int max1 = -1; // Index of max value after min

        // Find index of max value
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }

        // Find index of min value after max
        for (int j = max + 1; j < nums.length; j++) {
            if ( nums[j] <  min) {
                min = j;
            }
        }

        // Ensure min is assigned
        if (min == -1) {
          System.out.println(0);// No valid min found after max
        }

        // Find index of max value after min
        for (int k = min + 1; k < nums.length; k++) {
            if (max1 == -1 || nums[k] > nums[max1]) {
                max1 = k;
            }
        }

        // Ensure max1 is assigned
        if (max1 == -1) {
            System.out.println(0); // No valid max1 found after min
        }

        // Compute the value
       System.out.println(max);// Ensuring non-negative return
       System.out.println(min);// Ensuring non-negative return
       System.out.println(max1);// Ensuring non-negative return
    }
}