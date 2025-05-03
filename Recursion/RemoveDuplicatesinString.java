package Recursion;

public class RemoveDuplicatesinString {
    public static void main(String[] args) {
        String s = "appnnacollege";
        removeDuplicate(s, 0, new StringBuilder(""), new boolean[26]);
    }

    public static void removeDuplicate(String str, int idx, StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            removeDuplicate(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }
}
