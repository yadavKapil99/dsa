package BitManipulation;

public class oddOrEven {
    public static void isOddOrEven(int n){
        int bitMask = 1;

        if ((n & bitMask) == 0) {
            System.out.println("Even Number");
        }
        else System.out.println("odd number");

    }
    public static void main(String[] args) {
        isOddOrEven(3);

        isOddOrEven(100);
    }
}
