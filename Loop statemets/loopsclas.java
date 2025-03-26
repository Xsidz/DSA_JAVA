import java.util.*;

public class loopsclas {
    public static void main(String[] args) {
        int count = 0;
        while (count <= 100) {
            System.out.println(count);
            count++;

        }

        // Sum of N natural Number

        System.out.println("Enter the numbers you want Sum of : ");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int temp = 1;
        long sum = 0;

        while (temp <= num) {
            sum += temp;
            temp++;

        }
        System.out.println("The addtion of the N natural numbers is : " + sum);

        // Square pattern using for loop

        for (int i = 0; i < 4; i++) {
            System.out.println(" ");
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
        }

        // print reverse number

        int num1 = 10899;

        // reverse the number

        int rev = 0;

        while (num1 > 0) {

            int lastdig = num1 % 10;
            rev = (rev * 10) + lastdig;
            num1 /= 10;
        }
        System.out.println(rev);

        // Break pratice 1

        do {
            System.out.println("Enter the Number");
            int unum = sc.nextInt();
            if (unum % 10 == 0) {
                // System.out.println("Caught You!!");
                // break;
                continue;
            }
            System.out.println("the num is  : " + unum);
        } while (true);

    }

}
