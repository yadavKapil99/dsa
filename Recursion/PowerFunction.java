package Recursion;

class PowerFunction {
    public static double power(double x, int n) {
        if (n == 0) return 1; 
        
        double half = power(x, n / 2); 
        
        if (n % 2 == 0) {
            return half * half; 
        } else {
            return (n > 0) ? half * half * x : (half * half) / x; 
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10)); 
        System.out.println(power(3, 5));  
        System.out.println(power(2, -3)); 
    }
}

