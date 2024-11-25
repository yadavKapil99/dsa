import java.util.*;

// time complexity = nlogn
// Arrays.sort(arr)

// selection, insertion and bubble sort = n*n;

public class inbuiltSort {
    
    public static void main(String[] args) {
        int arr [] = {1,2,8,4,6,2,1000};
    
        Arrays.sort(arr);
        // Arrays.sort(arr,si,ei)   == ei is non inculdable

        // Arrays.sort(arr,si,ei,Collections.reverseOrder())   == it is for descending order  == only for object class like not for int but work for Integer

        System.out.println(Arrays.toString(arr));
    }
}
