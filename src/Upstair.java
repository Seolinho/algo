import java.util.Scanner;

public class Upstair {
    //상태 n
    //높이가 n인 계단을 오르는 경우의 수
    //점화식 : up(n) = up(n-1) + up(n-2)
    //종료조건 : up(1) -> 1 , up(0)->1
    public static int up(int n){
        if(n==1 || n ==0){
            return 1;
        }
        return up(n-1) + up(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(up(n));
    }
}
