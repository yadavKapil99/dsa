package greedy;

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] finish = { 2, 4, 6, 7, 9, 9 };
        int n = start.length;
        int result = selectActivities(start, finish, n);
        System.out.println("Total activity :" + result);
    }

    public static int selectActivities(int[] start, int[] finish, int n) {
        int i = 0;
        int count = 1;

        for(int j=1; j<n; j++){
            if(finish[i]< start[j]){
                i=j;
                count++;
            }
        }
        return count;
    }
}
