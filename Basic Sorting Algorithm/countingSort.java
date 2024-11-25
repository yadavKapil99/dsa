import java.util.*;

public class countingSort {

    public static int [] countSort(int arr[]){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            largest = Math.max(arr[i],largest);
        }

        int count [] = new int[largest+1];

        for(int i=0;i<n;i++){
            count[arr[i]] ++;
        }

        // sorting
        int j =0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        return arr;
    } 
    public static void main(String[] args) {
        int arr []= {1,4,1,3,2,4,3,7};

        int [] sortedArray = countSort(arr);

        System.out.println(Arrays.toString(sortedArray));
    }
}
