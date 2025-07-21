package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ClassRoom {
    public static void main(String[] args) {
        int[] start = { 0,1, 3, 5, 5, 8};
        int[] end = {6, 2, 4, 7, 9, 9 };

        // sorting
        int activities[] [] = new int[start.length][3];
        for(int i = 0; i<start.length; i++){
            activities[i][0] = i; // index
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // LEMBDA expression to sort based on end time
        Arrays.sort(activities, Comparator.comparingInt(a -> a[2]));

        System.out.println("Sorted activities based on end time:"+Arrays.deepToString(activities));

        // end time basis sorted 
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        for(int i = 1; i<end.length; i++){
            if(start[i] >= lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Total activities: " + maxAct);

    }
}
