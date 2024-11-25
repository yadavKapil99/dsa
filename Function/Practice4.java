import java.util.*;
public class Practice4 {

    public static int reverseTheNumber(int a){

        int sign = 0;
        if(a<0){
            a = a*-1;
            sign = 1;
        }
        int reverse = 0;
        while (a>0){
            int last = a%10;
            reverse = reverse*10 + last;
            a=a/10;
        }
        if(sign == 1){
            return -1*reverse;
        }

        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int x = sc.nextInt();

        int result = reverseTheNumber(x);

        System.out.println("reversed is : "+result);

    }
}
