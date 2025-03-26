import java.util.*;

public class questions {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter Number A :");
         float A = sc.nextInt();
         System.out.println("Enter Number B :");
         float B = sc.nextInt();
         System.out.println("Enter Number C:");
         float C = sc.nextInt();

         double Avg = A + B + C;

         System.out.println("The Average of the numbers is :" + Avg);

         System.out.println("\n \n Now Calculating Side of the Square!!");
         System.out.println("Enter the Side of the Square : ");
         float side = sc. nextFloat();
         double area = side * side;
         System.out.println("The Area of the Square is : " + area);
         

         System.out.println("\n \n Billing Section Question : ");
         System.out.println("Enter the Cost of Pencil : ");
         float pencil = sc.nextFloat();
         System.out.println("Enter the Cost of Pen : ");
         float pen = sc.nextFloat();
         System.out.println("Enter the Cost of Eraser : ");
         float eraser = sc.nextFloat();
         float total =  pencil + pen + eraser ;

         System.out.println("The Final Bill :\n Pencil : " + pencil + "\n Pen :" + pen +"\n Eraser :" + eraser );
         System.out.println("Totla : " + total);

         // Promotion Conversion 

         byte b = 4;
         char c = 'a';
         short s = 512;
         int i = 1000;
         float f = 3.14f;
         double d = 99.9954;

         double result = (f*b)+(i%c)-(d*s) ;
        System.out.println(result);
         int $ =24;
         System.out.println($);
    }
}
