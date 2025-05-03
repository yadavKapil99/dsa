package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n){
        if (n == 0 || n==1){
            return n;
        }

        int fib1 = fibonacci(n-1);
        int fib2 = fibonacci(n-2);

        int result = fib1 + fib2;

        return result;
    }
}
