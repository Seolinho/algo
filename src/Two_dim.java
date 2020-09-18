import java.util.Scanner;

public class Two_dim {
    public static void main(String[] args) {
        //int sss = Integer.MIN_VALUE;
        int[] input = new int[12];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        sc.close();
        //System.out.println("배열 입력 = " + Arrays.toString(input));
        //50 -2 47 14 18 93 -70 -73 88 -9 17 100
        int[][] output1 = new int[3][4];
        int[][] output2 = new int[4][3];
        int cnt = 0;

        for (int i = 0; i < output1.length; i++) {
            for (int j = 0; j < output1[i].length; j++) {
                output1[i][j] = input[cnt];
                cnt++;
            }
        }
        //System.out.println(Arrays.deepToString(output1));

        for (int i = 0; i < output2.length; i++) {
            for (int j = 0; j < output2[i].length; j++) {
                output2[i][j] = output1[j][i];
            }
        }
        //System.out.println(Arrays.deepToString(output2));

        for (int i = 0; i < output1.length; i++) {
            for (int j = 0; j < output1[i].length; j++) {
                System.out.print(output1[i][j]+" " );
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < output2.length; i++) {
            for (int j = 0; j < output2[i].length; j++) {
                System.out.print(output2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
