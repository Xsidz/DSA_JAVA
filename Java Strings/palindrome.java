public class palindrome {
    public static void PalindromeString(String str){
        int n = str.length();
         for (int i = 0; i < n-1; i++) {
            if(str.charAt(i) != str.charAt(n-1-i)){
                   System.out.println("String is Not Palindrome");
                   break;
            }
            System.out.println("String is Palindrome");
         }
    }
    public static void main(String[] args) {
        String str = "racecar";
        PalindromeString(str);
    }
}
