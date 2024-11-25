import java.util.Arrays;

public class selectionSort {

    public static int [] selectionSort(int arr[]){

        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            } 
            
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
    public static void main(String[] args) {
        int arr [] = {5,4,1,10,3,2};

        int sortedArray [] = selectionSort(arr);

        System.out.println(Arrays.toString(sortedArray));
    }    
}
