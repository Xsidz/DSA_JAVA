public class kdensAlgo {

    public static void kadenalgo(int arr[]) {
        int csum = 0;
        int msum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            csum = csum + arr[i];
            if (csum < 0) {
                csum = 0;
            }
            msum = Math.max(csum, msum);
        }
        System.out.println("The max sum is : " + msum);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadenalgo(arr);
    }
}
