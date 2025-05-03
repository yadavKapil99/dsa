package Strings;

public class shortestPath {

    public static int calcShortestPath(String str){
        int x = 0;
        int y = 0;

        int n = str.length();

        for(int i=0; i<n; i++){

            char dir = str.charAt(i);

            if (dir == 'E') {
                x++;
            }
            else if (dir == 'W') {
                x--;
            }
            else if (dir == 'N') {
                y++;
            }else {
                y--;
            }
        }

        int X = x*x;
        int Y = y*y;

        return (int)Math.sqrt(X + Y);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";

        int distance = calcShortestPath(str);

        System.out.println(distance);
    }
}
