public class operators{
    public static void main(String[] args) {
        
        // arithmatic Operator

        // Binary 
         int A = 10;
         int B = 20;

         System.out.println((A + B)); // Addition
         System.out.println((A - B)); // Subtraction
         System.out.println((A * B));// Multiplication
         System.out.println((A/B));// Division 
         System.out.println((A%B));// Modulo operator 

         // Unary

         System.out.println(A++); // Use value and then add 1 
         System.out.println(A--);// Use value and then sub 1 
         System.out.println(++B);// Add 1 and then use B value
         System.out.println(--B);// Subtract 1 and the use B value
            

         // Relational Operator 

         System.out.println(A==B); // check if equal
         System.out.println(A!=B);// check if not equal to 
         System.out.println(A>B);// check if greater than
         System.out.println(A<B);// check if less than
         System.out.println(A>=B);// check if greater than eqaual to 
         System.out.println(A<=B);// check if less than eqaul to


         // Logical Operator 

         System.out.println( (A==B) && (B != A)); // Logical And, if both true then return true
         System.out.println( (A==B) || (B != A)); // Logical OR , If any condition true returns true
         System.out.println( !(B != A));// Logical not , reverse the answer

         
         // Assignment Operators

         System.out.println( A = B); // A is assigned value of B
         System.out.println( A += B); // Value of A = A + B
         System.out.println( A -= B);// Value of A = A-B
         System.out.println( A *= B);// Value of A = A * B
         System.out.println( A /= B);// Value of A = A / B

    }
}