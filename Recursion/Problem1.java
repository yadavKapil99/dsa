package Recursion;

public class Problem1 {
    public static void indexes(int []arr, int key, int si, int ei) {
        if(si > ei){
            return;
        }

        if(key == arr[si]){
            System.out.println(si + "");
        }

        indexes(arr, key, si+1, ei);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        indexes(arr, key, 0, arr.length - 1);
    }
}
