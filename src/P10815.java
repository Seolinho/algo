import java.util.Arrays;
import java.util.Scanner;

public class P10815 {
    public static void main(String[] args) {
        //1초 1억 마지노선
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] card = new int[N];
        for (int i = 0; i < card.length; i++) {
            card[i] = sc.nextInt();
        }
        Arrays.sort(card);
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int s = 0;
            int e = card.length;
            int x = sc.nextInt();
            boolean flag = false;

            int sol = Arrays.binarySearch(card, x);
            if(sol <0) System.out.print(0 +" ");
            else System.out.print(1 +" ");
        }
    }
}
