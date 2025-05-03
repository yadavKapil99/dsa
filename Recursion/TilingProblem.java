package Recursion;
// floor size 2*n  
// tile 2*1

public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(noOfWays(3));
    }

    public static int noOfWays(int n){
        if(n==0 || n==1) return 1;

        int vertical = noOfWays(n-1);

        int horixontal = noOfWays(n-2);
        return vertical + horixontal;
    }
}
