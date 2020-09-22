import java.util.Arrays;
import java.util.Scanner;

public class block {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] block = new int[9][9];
        for (int[] row : block) {
            for (int i = 0; i < block.length; i++) {
                row[i] = sc.nextInt();
            }
        }
        sc.close();
        int[] sum = new int[9];
        //방 배정 인덱스
        int i = 0;
        int j = 0;
        System.out.println(Arrays.toString(sum));
        for (int y = 0; y < block.length; y++) {
            j = i;
            for (int x = 0; x < block[y].length; x++) {


                sum[i] += block[y][x];
                if (x == block[y].length - 1) break;
                if (x % 3 == 2) {
                    i = i + 1;
                }

            }
            if (y % 3 == 2) {
                i = i + 1;
            } else {
                i = j;
            }
        }
        for (int v : sum) {
            System.out.println(v);
        }

    }
}
