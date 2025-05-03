package Recursion;

public class Problem2 {
    public static void printLetters(int number){
        String arr [] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        if(number > 0){
            int last = number % 10;
            number = number/10;
            printLetters(number);
            System.out.print(arr[last] + "");
        }
    }
    public static void main(String[] args) {
        int number = 2024;
        printLetters(number);
    }
}
