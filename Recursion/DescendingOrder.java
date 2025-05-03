package Recursion;

public class DescendingOrder {
    public static void main(String[] args) {
        int number = 10;
        decreasing(number);
    }

    public static void decreasing(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        decreasing(n-1);
    }
}
