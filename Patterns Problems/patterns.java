public class patterns {
    public static void main(String[] args) {

        // star Pattern

        for (int i = 0; i <=4; i++) { //colums
            System.out.println(" ");
            for(int j = 0; j<i;j++){ //rows
            System.out.print("*");
            }
        }

        // Inverted Star Pattern
        for (int i = 4; i >= 1; i--) { // colums
            System.out.println(" ");
            for (int j = i; j >= 1; j--) { // rows
                System.out.print("*");
            }
        }

        // Half-Pyramid 

        for (int i = 0; i <= 4; i++) { // colums
            for (int j = 1; j <= i; j++) { // rows
                System.out.print(j);
            }
            System.out.println();
        }

        // Character Patttern 

        char a = 'A';
        
        for (int i = 0; i < 4; i++) {
            for(int j = 0;j <= i;j++){
                System.out.print(a++);
            }
            System.out.println(" ");
        }
    }
}
