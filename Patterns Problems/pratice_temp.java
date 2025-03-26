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

        boolean c = true;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                if (c == true) {
                    System.out.print(1);
                    c = !c;
                }
                 else if (c == false) {
                    System.out.print(0);
                    c = !c;
                }
                

            }
            System.out.println();
        }

    }
}
