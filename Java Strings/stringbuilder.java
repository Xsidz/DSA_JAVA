public class stringbuilder { 

    public static void CapitalString(String str){
     StringBuilder sb = new StringBuilder(" ");

     char ch = Character.toUpperCase(str.charAt(0));
     sb.append(ch);

     for (int i = 1; i < str.length(); i++) {
        
        if(str.charAt(i) == ' ' && i < str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }else{
            sb.append(str.charAt(i));
        }

     }

     System.out.println(sb.toString());
        
    }

    public static void DecomPress(String str){
        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count >1){
                sb.append(count.toString());
            }
        }
        System.out.println(sb.toString());
    }
        public static void main(String[] args) {
        String str = "aaaaabbcccdddefffgtt";
        DecomPress(str);
    }
}
