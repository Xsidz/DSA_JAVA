public class diagonalsum {
    public static void diagonalSum(int arr[][]) {
        int pirmaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int i = 0;
        int j = 0;
        int rowlen = arr.length;
        int collen = arr[0].length;

        while (i < rowlen && j < collen) {

            pirmaryDiagonalSum += arr[i][j];
            secondaryDiagonalSum += arr[rowlen - (i + 1)][collen - (j + 1)];
            i++;
            j++;
        }
        System.out.println("Primary Diagonal Sum is : " + pirmaryDiagonalSum);
        System.out.println("Secondary Diagonal Sum is : " + secondaryDiagonalSum);
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };

        diagonalSum(arr);
    }
}
