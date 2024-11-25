import java.util.*;

class Practise1{

    public static float average(int a,int b,int c){
        float result =(a+b+c)/3.0f;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers for average : ");
        int x= sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();


        System.out.println("The average is : "+average(x, y, z));

    }
}