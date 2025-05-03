package Strings;

public class converStringToUppercase {

    public static String toUpperCase(String str){
        StringBuilder newString = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        newString.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                newString.append(str.charAt(i));
                i++;
                newString.append(Character.toUpperCase(str.charAt(i)));
            }
            else newString.append(str.charAt(i));
        }

        return newString.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am kapil";

        System.out.println(toUpperCase(str));
    }
}
