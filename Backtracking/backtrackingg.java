public class backtrackingg {

    public static void chnageArr(int arr[], int i, int value) {

        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        // kaam
        arr[i] = value;
        chnageArr(arr, i + 1, value + 1);
        arr[i] = arr[i] - 2; // backtracking step
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void subSets(String str, String ans, int i) {

        // base case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        // yes choice
        subSets(str, ans + str.charAt(i), i + 1);

        // no choice

        subSets(str, ans, i + 1);
    }

    public static void findPermutation(String str,String ans){
        // base case
          if(str.length() == 0){
            System.out.println(ans);
          }
        //kaam 

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i+1);
            findPermutation(Newstr, ans+currentChar);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        chnageArr(arr, 0, 1);
        printArr(arr);
        subSets("abc", " ", 0);
        findPermutation("abc"," ");

    }
}
