public class sortedarraysearch {
    public static void soretdsearch(int arr[][], int key) {
        int i = 0, j = arr[0].length-1;

        while (i <= arr.length && j >= 0) {
            if (arr[i][j] > key) {
                j--;
            }
            if (arr[i][j] < key) {
                i++;
            }
            if (arr[i][j] == key) {
                System.out.println("The index at which key found is :" + i + " " + j);
                break;
            }
        }
    }

    public static void main(String[] args) {

        int arr[][] = {
                { 10, 20, 30, 40 },
                {
                        15, 25, 35, 45
                },
                {
                        27, 29, 37, 48
                },
                {
                        32, 33, 39, 50
                }
        };

        soretdsearch(arr, 33);
    }
}
