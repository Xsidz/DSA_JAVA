import java.util.*;

public class input_in_java {
    
    public static void main(String[] args) {
        
        //input in java 
      Scanner sc = new Scanner(System.in);

    //   System.out.println("Enter your name:");
    //   String name = sc.nextLine();
    //   System.out.println("Welcome " + name);
    //   System.out.println("Enter your age:");
    //   int age = sc.nextInt();
    //   System.out.println("You are " + age + " years old");
    //   System.out.println("Enter your Weight");
    //   float weight = sc.nextFloat();
    //   System.out.println("Your Weight is : " + weight);
       
    System.out.println("Enter the value of a : ");
    int a = sc.nextInt();
    System.out.println("Enter the value of B : ");
    int b = sc.nextInt();

    int sum = a + b;
    int product = a * b ;
    System.out.println("The sum of given varible is  : " + sum);
    System.out.println("The product of the give values is : " + product);
    }
}
