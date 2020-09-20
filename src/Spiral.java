import java.util.Arrays;
import java.util.Scanner;

public class Spiral {
                                    //우하좌상
    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, -1, 0, 1};

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






        }
        System.out.println(Arrays.deepToString(ary));
    }
}
