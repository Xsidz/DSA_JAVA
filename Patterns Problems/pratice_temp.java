public class pratice_temp {
    public static void main(String[] args) {

        // holow square pattern

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4) {
                    System.out.print("*");
                } else {

                    System.out.print(" ");

                }

            }
            System.out.println(" ");
        }

        // Inverted & Rotated Half Pyramid

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= 4; j++) {
                if (j < 4 - (4 - i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

        // Inverted Half pyramid with numberrs

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Floyd's triangle
        int b = 1;
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(b++ + " ");
            }
            System.out.println();
        }

        // 0-1 triangle

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);

                } else if ((i + j) % 2 != 0) {
                    System.out.print(0);

                }

            }
            System.out.println();

        }

        // Butterfly pattern

        // first half
        int k = 5;
        for (int i = 1; i < k; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (k - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Seconf Half

        for (int i = k; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (k - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Solid Rohumbus

        for (int i = 0; i <= k; i++) {

            // spaces
            for (int j = 0; j <= k - i; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j <= 4; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // hollow rhombus

        for (int i = 0; i <= k; i++) {

            // spaces
            for (int j = 0; j <= k - i; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j <= k; j++) {
                if (i == 0 || i == k || j == 0 || j == k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // space
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // Diamond pattern

        for (int i = 1; i <= k; i++) {

            // spaces

            for (int j = 1; j <= k - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int i = k; i >= 0; i--) {

            // spaces

            for (int j = 1; j <= k - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
