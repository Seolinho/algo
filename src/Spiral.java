import java.util.Arrays;
import java.util.Scanner;

public class Spiral {
                                    //상하좌우
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] ary = new int[n][n];
        int x = 0;
        int y = 0;
        int next = 1;
        int direction = 3;


        while (next <= n * n) {
            ary[y][x] = next++;

            int ny = dy[direction];
            int nx = dx[direction];

            y = y + ny;
            x = x + nx;




       /*     if (x == n){
                //down
                direction = 1;
            }
            if (y == n){
                //left
                direction = 2;
            }
            if (x <= 0){
                //up
                direction = 0;
            }
            if(ary[y][x] != 0){
                direction = 3;
            }*/




        }
        System.out.println(Arrays.deepToString(ary));
    }
}
