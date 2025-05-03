package BackTracking;

public class DigitCombinationSum {
    public static void main(String[] args) {
        int number = 1296;
        int target = 36;

        boolean result = canFormTarget(String.valueOf(number), target, 0, 0);
        System.out.println("Can any combination form the target? " + result);
    }

    public static boolean canFormTarget(String numStr, int target, int index, int currentSum) {
        if (index == numStr.length()) {
            return currentSum == target;
        }

        int num = 0;
        for (int i = index; i < numStr.length(); i++) {
            num = num * 10 + (numStr.charAt(i) - '0');
            if (canFormTarget(numStr, target, i + 1, currentSum + num)) {
                return true;
            }
        }
        return false;
    }
}
