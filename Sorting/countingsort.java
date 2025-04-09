package Sorting;

public class countingsort {

    public static void CountingSort(int arr[]) {
        int max = 0, min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int range = max - min + 1;
        System.out.println("the raange value is :" + range);
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

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7, 7 };
        CountingSort(arr);
    }
}
