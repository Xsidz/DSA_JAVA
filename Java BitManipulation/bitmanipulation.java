public class bitmanipulation {

    public static void OddEven(int num){
        int number = num & 1;
        if(number == 1){
           System.out.println("Number is Odd");
        }
        else{
            System.out.println("Number is even");
        }
    }

    public static void GetithBit(int i,int number){
        int bitmask = 1 << i;
        if((number & bitmask) == 0){
            System.out.println("The bit is : 0 ");
        }else{
            System.out.println("The bit is : 1");
        }

    }

    public static void SetIthBit(int i, int num){
        int bitmask = 1 << i;
        System.out.println(num | bitmask);
    }
    public static void ClearIthBit(int i, int num){
        int bitmask = ~(1 << i);
        System.out.println((num & bitmask));
    }
    public static void UpdateBit(int num, int i, int newbit){
        if(newbit == 0){
            ClearIthBit(i, num);
        }else{
            SetIthBit(i, num);
        }
    }

    public static void  ClearLastIthBit(int n, int i){
         int bitmask = (~0) << i;
         System.out.println(n & bitmask);
    }

    public static void checkPower(int n){
        if((n & n-1) == 0){
            System.out.println("Power of 2");
        }else{
            System.out.println("Not power of 2");
        }
    }

    public static void countSetBitts(int n){
        int count = 0;
        while(n>0){
            if((n&1)!= 0){
                count++;
            }
           n= n >> 1;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        OddEven(12);
        GetithBit(2, 10);
        SetIthBit(2, 10);
        ClearIthBit(1, 10);
        UpdateBit(10, 1, 0);
        ClearLastIthBit(15, 2);
        checkPower(16);
        countSetBitts(10);

    }
}
