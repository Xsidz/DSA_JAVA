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

    public static void Largestno(int arr[]){
        int large = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > large){
                large = arr[i];
            }
            
        }
        System.out.println("The Largest number is : " + large);
    }

    public static int BinarySearch(int arr[], int key){
        int start =0 , end = arr.length-1;
        while (start <= end) {
            int mid = start+end/2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid+1;
               
            }
            if(arr[mid] > key){
                end = mid-1;
            }
            
        }
       return -1;
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
    }
}
