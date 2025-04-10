public class spiralmatrix {

    public static void spiral(int arr[][]) {

        int rowStart = 0;
        int colStart = 0;
        int rowEnd = arr.length - 1;
        int colend = arr[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colend) {

            for (int j = colStart; j <= colend; j++) {
                System.out.print(arr[rowStart][j] + " ");
            }
            for (int i = rowStart + 1; i <= rowEnd; i++) {
                System.out.print(arr[i][colend] + " ");

            }
            for (int j = colend - 1; j >= colStart; j--) {
                if(colStart == colend){
                    return;
                }
                System.out.print(arr[rowEnd][j] + " ");

            }
            for (int i = rowEnd - 1; i >= rowStart; i--) {
                System.out.print(arr[i][colStart] + " ");

            }

            rowStart++;
            colStart++;
            rowEnd--;
            colend--;

        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };

        spiral(arr);
    }

}
