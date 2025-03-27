
public class binarytodecimal {
    public static void bintodec(double a) {
        int tnum = 0;
        int power = 0;

        while (a > 0) {
            double snum = a % 10; // Get the last digit (0 or 1)
            tnum += snum * Math.pow(2, power); // Multiply by 2^position
            a /= 10; // Remove the last digit
            power++; // Increase power
        }
        System.out.println("The decimal number is: " + tnum);

    }

    public static void dectobin(int a) {
        int power = 0;
        double bin = 0;
        while (a > 0) {
            double rem = a % 2;
            bin = (int)bin + (rem * Math.pow(10, power));
            power++;
            a = a / 2;
        }
        System.out.println("The binary number is : " + bin);
    }

    public static void main(String[] args) {
        bintodec(101);
        dectobin(5);
    }
}
