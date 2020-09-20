import java.util.Arrays;
import java.util.Scanner;

public class Spiral {
                                    //우하좌상
    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[][] ary = new int[n][n];
        int x = 0;
        int y = 0;
        int next = 1;
        int direction = 0;


        while (next <= n * n) {
            ary[y][x] = next++;

            int ny = y + dy[direction];
            int nx = x + dx[direction];

            //다음 진행방향 검사
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || ary[ny][nx] != 0) {
                direction = (direction + 1) % 4;
                nx = x + dx[direction];
                ny = y + dy[direction];
            }

            y = ny;
            x = nx;
        }
        for (int[] row : ary) {
            for (int v : row) {
                System.out.printf( "%5d" , v);
            }
            System.out.println();
        }
    }
}
