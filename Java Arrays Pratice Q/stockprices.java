public class stockprices {

    public static int Stockprices(int arr[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            if(buyprice < arr[i]){
                int profit = arr[i] - buyprice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyprice = arr[i];
            }
        }
       return maxProfit;
    }

    public static void main(String[] args) {
        int price[] = { 2,12,1,3,6,4};
        System.out.println(Stockprices(price));
    }
}
