import java.util.*;

public class practise3 {

    public static boolean pallildrom(int a){
        boolean isPallildrom = false;
        int original = a;
        int reverse = 0;
        while(a>0){
            int last = a%10;
            reverse = reverse*10 + last ;
            a = a/10;
        }

        return original == reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no to check");
        int x = sc.nextInt();

        boolean result = pallildrom(x);
        System.out.println(result);
        if(result) System.out.println("It is pallildrom ");
        else System.out.println("Not a Pallildrom");
    }
}