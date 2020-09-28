import java.util.Arrays;
import java.util.Scanner;

public class P1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();

            int s = 0;
            int e = a.length;
            boolean flag = false;
            while (s < e){
                int m = (s + e) / 2;
                int v = a[m];

                if(v > x) e = m;
                else if(v < x) s = m+1;
                else{
                    flag =true;
                    break;
                }
            }
            System.out.println(flag?1:0);
        }

    }
}

