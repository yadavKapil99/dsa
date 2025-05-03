package Strings;

public class LargestString {
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};

        String largestString = fruits[0];

        for(int i=1; i < fruits.length; i++){
            if(fruits[i].compareToIgnoreCase(largestString)>0){
                largestString = fruits[i];
            }
        }

        System.out.println(largestString);
    }
}
