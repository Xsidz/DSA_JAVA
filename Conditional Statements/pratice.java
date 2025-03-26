import java.util.*;

public class pratice {
    public static void main(String[] args) {

        // check if number is positive or nrgative

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        long num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative Number");
        }

        // checks fever

        System.out.print("Enter the tempreature to check :");
        float temp = sc.nextFloat();
        if (temp >= 100) {
            System.out.println("You have fever");

        } else {
            System.out.println("You dont have fever");
        }
         

        // check Leap year

        System.out.print("Enter the year to check for :"); 
        long year = sc.nextLong();

        if(year % 4 == 0){
            if(year %100 == 0){
                if(year % 400 == 0){
                    System.out.println("Year is Leap Year!!");
                }
            }
        }else{
            System.out.println("Year is not leap year!!");
        }

    }
}
