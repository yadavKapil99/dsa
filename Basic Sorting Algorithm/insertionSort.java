import java.util.Arrays;

public class insertionSort {
     public static int [] insertionSort(int arr[]){

        int n = arr.length;

        for(int i=1;i<n;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev --;
            }
            arr[prev+1] = curr;
        }

        return arr;
    }
    public static void main(String[] args) {
        int arr [] = {5,4,1,10,3,2};

        int sortedArray [] = insertionSort(arr);

        System.out.println(Arrays.toString(sortedArray));
    }  
}
