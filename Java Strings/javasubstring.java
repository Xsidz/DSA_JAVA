public class javasubstring {

    public static void Substr(String str, int si, int ei){
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        } 
        System.out.println(substr);
    }
    public static void main(String[] args) {
        String str = "Hello World";
       Substr(str, 0, 5);
    }
}
