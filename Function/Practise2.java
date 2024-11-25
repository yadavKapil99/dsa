import java.util.*;

public class Practise2 {

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = sc.nextInt();

        boolean result = isEven(x);

        if(result) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
