public class type_conversion {
    public static void main(String[] args) {
        
        int a = 35;
        long b = a;

        // This is allowed cuz a is int and smaller than long 

        //but

        // int c =  b ;

        // this is not allowed as the size of int is 4 byte and long is 8 bute which make the converion lossy which is not allowed as data might be lost as there is less space in int
        // this is implicit conversion by java 



        // Explict Conversion

        // to bypass the java limitation of conversion we can do following

        int d = (int) b;
        // here explict conversion that is conversion by user is performed this mighr be lossy but its aloowed by java

    

        //Type Promotion
        /* 
         * 1. Java auto promotes bute, short or char to int when evaluating expression
         * 2. also if one operand is long, float or double the whhoel expression can 
         * be promoteed to float, long, double respectively
         */

         // promotions only occur in the expressions not in general


         char xy = 'a';
         char xc = 'b';

         System.out.println(xy-xc);
    }

    
}
