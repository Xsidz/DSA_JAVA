public class stockprices {

    public static void Stockprices(int arr[]) {
        int minidx = 0;
        int minprice = arr[0];
        int maxprice = 0;
        int maxidx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (minprice > arr[i]) {
                minprice = arr[i];
                minidx = i;
            }
        }
        for (int i = minidx; i < arr.length; i++) {
            if(maxprice < arr[i]){
                maxprice = arr[i];
                maxidx = i;
            }
        }
       System.out.println("To get highest profit buy on day " + minidx + " and sell on day " + maxidx + " to get profit of " + (maxprice-minprice) +" per share ");
    }

    public static void main(String[] args) {
        int price[] = { 7,1,5,3,6,4};
        Stockprices(price);
    }
}
