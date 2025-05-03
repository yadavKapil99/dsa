package BitManipulation;

public class Problem {

    public static void reverseNumber(int a, int b) {
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

        System.out.println("a :" + a);
        System.out.println("b :" + b); 
    }

    public static void main(String[] args) {
        reverseNumber(5, 6);
    }
}
