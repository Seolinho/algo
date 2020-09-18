import java.util.Scanner;

public class Magic_algo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int[][] magic = new int[n][n];
        int x = n / 2;
        int y = 0;
        int next = 1;

        while (next <= n * n) {
            magic[y][x] = next++;

            int nx = x + 1;
            if (nx >= n) nx = 0;
            int ny = y - 1;
            if (ny < 0) ny = n - 1;

            if (magic[ny][nx] != 0) {
                nx = x;
                ny = y + 1;
                if (ny >= n) ny = 0;
            }

            x = nx;
            y = ny;
        }

        for (int[] row : magic) {
            for (int v : row) {
                System.out.printf("%3d", v);
            }
            System.out.println();
        }
    }
}