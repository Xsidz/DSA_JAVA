package Sorting;

public class insertionsort {
    public static void InsertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i-1;

            while (prev >= 0 && arr[prev] > current) {
                arr[prev+1] = arr[prev];
                prev--;
                System.out.println("Value of prev after -- " + prev);
            }
            arr[prev+1] = current;
            System.out.println("value of prev after loop : " + prev);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        InsertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
