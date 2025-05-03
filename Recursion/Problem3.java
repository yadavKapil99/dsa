package Recursion;

public class Problem3 {
    public static int stringLength(String s) {
        if (s.equals("")) {
            return 0;
        }

        return 1 + stringLength(s.substring(1));
    }

    public static void main(String[] args) {
        String s = "Kapil";
        int result = stringLength(s);

        System.out.println("Length of the string: " + result);
    }
}
