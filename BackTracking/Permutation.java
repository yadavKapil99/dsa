package BackTracking;

public class Permutation {
    public static void permutations(String str, String ans){
        //base
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // kaam
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i)+ str.substring(i+1, str.length());

            permutations(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permutations(str, "");
    }
}
