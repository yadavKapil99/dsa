package BitManipulation;

public class getIthBit {
    public static int getIthBitOf(int n, int i) {
        int bitMask = 1 << i;

        if((n & bitMask) == 0){
            return 0;
        }
        else return 1;
    }

    public static void main(String[] args) {
        System.out.println((char)('A' | ' '));
    }
}
