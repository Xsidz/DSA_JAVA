import java.util.*;

public class primemum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");

        int n = sc.nextInt();

        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                System.out.println("The number is composite!");
            } else {
                System.out.println("The numbre is prime!!");
                break;
            }
        }
    }
}
