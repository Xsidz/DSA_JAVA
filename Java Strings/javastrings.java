public class javastrings {
    public static void main(String[] args) {
        
        String firstName = " Siddhesh";
        String lastName = "kabra";
        String fullName = firstName + " " +lastName;
        System.out.println(fullName);

        // Extract character from any index

        firstName.charAt(3);

        for (int i = 0; i < firstName.length(); i++) {
            System.out.println(firstName.charAt(i));
        }
    }
}
