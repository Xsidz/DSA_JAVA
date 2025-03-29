public class TrappingWater {

    public static  void trapwater(int arr[]){
        int leftmax[] = new int[arr.length];
        int rightmax[] = new int[arr.length];
        int trappedwater = 0;
        int width = 1;

        leftmax[0] = arr[0];
        rightmax[arr.length-1] = arr[arr.length-1];

        //leftmax boundary
              for (int i = 1; i < arr.length; i++) {
                leftmax[i] = Math.max(leftmax[i-1],arr[i]);
              }
        //rightmax boundary
              for (int i = arr.length-2 ; i >=0; i--) {
                rightmax[i] = Math.max(rightmax[i+1], arr[i]);
              }
              
              for (int i = 0; i < arr.length; i++) {
                 int waterlevel = ((Math.min(leftmax[i], rightmax[i])) * width);
                 trappedwater += waterlevel - arr[i];
              }


        System.out.println("Teh total water trapped is : " + trappedwater);
        
    }
    public static void main(String[] args) {
         int arr[] ={ 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
         trapwater(arr);
    }
}
