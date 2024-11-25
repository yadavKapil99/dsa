package Array;

public class RainWater {

    public static int rainWaterStored(int heights[]){
        int n = heights.length;

        int waterStored = Integer.MIN_VALUE;
        int currentWater,left=0,right=n-1;

        while(left < right){
            currentWater = (right-left)*Math.min(heights[left], heights[right]);

            for(int i=left+1;i<right;i++){
                currentWater -= heights[i];
            }

            waterStored = Math.max(currentWater, waterStored);
            
            if(heights[left]<heights[right]) left +=1;
            else right -= 1;
        }
        return waterStored;
    }
    public static void main(String[] args) {
        int array[] = {4,2,0,6,3,2,5};
        int result = rainWaterStored(array);

        System.out.println("The maximum water stored is :"+result);
    }
}
