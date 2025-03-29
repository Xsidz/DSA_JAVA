import java.util.*;

public class arraycc {

    public static void LinearSearch(String key) {
        String num[] = { "apple", "banana", "orange", "pineapple" };

        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                System.out.println(i);
            }
        }
    }

    public static void Largestno(int arr[]) {
        int large = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }

        }
        System.out.println("The Largest number is : " + large);
    }

    public static void pairArray(int arr[]) {
        int inx = 0;
        while (inx < arr.length) {
            for (int i = inx + 1; i < arr.length; i++) {
                System.out.print("(" + arr[inx] + " " + arr[i] + ")");
            }
            inx++;
            System.out.println();
        }
    }

    public static int BinarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + end / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;

            }
            if (arr[mid] > key) {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void ReverseArray(int arr[]) {
        int front = 0, last = arr.length - 1;

        while (front < last) {
            int temp = arr[last];
            arr[last] = arr[front];
            arr[front] = temp;
            front++;
            last--;
        }
    }

    public static void subarrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {

                    System.out.print(arr[j2]);

                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int marks[] = new int[50];
        int numbers[] = { 1, 2, 3 };
        String fruit[] = { "mango", "apple" };

        // input in array
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();

        System.out.println(marks[0]);
        // length of array
        System.out.println(marks.length);

        // Linear search
        LinearSearch("orange");
        int num[] = { 2, 4, 6, 8, 10 };
        Largestno(num);

        System.out.println("The key was found at :" + BinarySearch(num, 6));

        // resverse an array

        int sum[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        ReverseArray(sum);

        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
        }

        // Pair Array
        pairArray(sum);

        // SubArrays

        subarrays(sum);

    }
}
