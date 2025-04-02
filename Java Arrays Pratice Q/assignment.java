public class assignment {

    public static boolean DistinctElement(int arr[]){
        int candidate = 0;
        int count = 0;
      
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                candidate= arr[i];
                if(arr[j] == candidate){
                    count++;
                }
            }
            if (count >= 1) {
               return true;
            }
        }
        return false;
        
      
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
       System.out.println( DistinctElement(nums));
    }
}
