public class largestString {
    public static void LargestString(String arr[]){
            String largest = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if(largest.compareToIgnoreCase(arr[i]) < 0){
                    largest= arr[i];
                }
            }
        System.out.println("The largest String is : " + largest);
    }
    public static void main(String[] args) {
        String arr[] = {"apple", "mango","banana"};
        LargestString(arr);
    }
}
