import java.util.*;

public class Matrixarray {

    public static void Matrix(int arr[][], int key ) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (key == arr[i][j]) {
                    System.out.println("Element found at :" + i + "," + j);
                } 
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Enter the element for the index" +i + " " + j);
                arr[i][j] = sc.nextInt();

            }
        }
        Matrix(arr, 7);
    }
}
