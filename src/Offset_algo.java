import java.util.Scanner;

public class Offset_algo {
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[5][5];

        for (int[] row : arr) {
            for (int i = 0; i < row.length; i++) {
                row[i] = in.nextInt();
            }
        }
        in.close();

        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                boolean flag = true;
                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d];
                    int ny = y + dy[d];

                    if (ny >= 0 && ny < arr.length && nx >= 0 && nx < arr[ny].length) {
                        int other = arr[ny][nx];
                        if (arr[y][x] >= other) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) arr[y][x] = -1;

//                int nx, ny;
//                nx = x;
//                ny = y - 1;
//                if (ny >= 0 && ny < arr.length && nx >= 0 && nx < arr[ny].length) {
//                    int other = arr[ny][nx];
//                    if (arr[y][x] >= other) continue;
//                }
//
//                nx = x;
//                ny = y + 1;
//                if (ny >= 0 && ny < arr.length && nx >= 0 && nx < arr[ny].length) {
//                    int other = arr[ny][nx];
//                    if (arr[y][x] >= other) continue;
//                }
//
//                nx = x - 1;
//                ny = y;
//                if (ny >= 0 && ny < arr.length && nx >= 0 && nx < arr[ny].length) {
//                    int other = arr[ny][nx];
//                    if (arr[y][x] >= other) continue;
//                }
//
//                nx = x + 1;
//                ny = y;
//                if (ny >= 0 && ny < arr.length && nx >= 0 && nx < arr[ny].length) {
//                    int other = arr[ny][nx];
//                    if (arr[y][x] >= other) continue;
//                }
//
//                arr[y][x] = -1;
            }
        }

        for (int[] row : arr) {
            for (int value : row) {
                System.out.print((value == -1 ? "*" : value) + " ");
            }
            System.out.println();
        }
    }
}