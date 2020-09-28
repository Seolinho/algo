import java.util.Scanner;

public class Powerofx {
    //상태 (n,m)
    //n의 m 제곱
    //점화식 : p(n,m) = n * p(n,m-1)
    //종료조건 : p(n,1) -> n
    public static int p(int n, int m){
        if(m == 1) return n;
        return n * p(n,m-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(p(n,m));
    }
}
