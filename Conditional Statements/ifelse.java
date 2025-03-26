import java.util.*;

public class ifelse {
    public static void main(String[] args) {
            
        // If-Else Statement
 

        int age = 16;

        if (age >= 18) {
            System.out.println("You are Adult!!");

        }
        else{
            System.out.println("You are still a Minor!");
        }


        // Else-If 

        if (age >= 18) {
            System.out.println("You are Adult!!");

        }
        else if(age == 16 ){
            System.out.println("You are an growing Minor!!");
        }
        else{
            System.out.println("You are still a Minor!");
        }

        // Pratice 

        int a = 12;
        int b = 14;
 

        if(a >= b){
            System.out.println("A");
        }else{
            System.out.println("B");
        }

        // Pratice 2 

        int num = 2;

        if(num % 2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }


        // Pratice 3

        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();

        if(income < 500000){
            System.out.println("You have to pay 0% tax");
        }else if( (500000 >= income)  && (income <= 1000000)){
                   System.out.println("You Have to pay 20 % tax");
        }else{
            System.out.println("You have to pay 30% tax ");
        }
    }
}