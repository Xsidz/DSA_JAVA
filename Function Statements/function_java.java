import java.util.*;

public class function_java {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int product(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;

        System.out.println(" Value of a :" + a + "And value of b :" + b);
    }

    public static int factorial(int a) {
        int f = 1;
        if (a > 0) {
            for (int i = 1; i <= a; i++) {
                f *= i;
            }
        }
        return f;
    }

    public static int binomialcoeff(int n, int r) {
        int nfact = 1;
        int rfact = 1;
        int nrfact = 1;

        if (n > 0 && r > 0) {
            for (int i = 1; i <= n; i++) {
                nfact *= i;

            }
            for (int i = 1; i <= r; i++) {
                rfact *= i;

            }
            for (int i = 1; i <= (n - r); i++) {
                nrfact *= i;

            }

        }

        int bincoeff = nfact / (rfact * nrfact);
        return bincoeff;
    }

    public static void primeno(int a) {
        for (int i = 2; i < Math.sqrt(a) - 1; i++) {
            if (a % i == 0) {
                System.out.println("Number is not prime");
                break;
            } else {
                System.out.println("Number is Prime");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A");
        int a = sc.nextInt();
        System.out.println("Enter the number B");
        int b = sc.nextInt();

        int fact = factorial(a);
        System.out.println(fact);
        int binocoeff = binomialcoeff(a, b);
        System.out.println("Teh binomial coeff is : " + binocoeff);

        primeno(a);

    }
}
