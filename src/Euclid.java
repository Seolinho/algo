import java.util.Scanner;

public class Euclid {
    //상태 a, b
    //설명 a와 b의 최대공약수(a가 b보다 크다)
    //점화식 a가 클때 eu(a,b) = eu(b,a%b)
    //큰수가 앞에 있어야하니까 큰수를 앞으로 넘겨줌
    //종료조건 eu(a,0) = a
    public static int eu(int a, int b){
        if(b==0) return a;
        return eu(b,a%b);
    }

    public static void main(String[] args) {
        //8 12
        //12 8
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = eu(a,b);
        //호출 최소화
        System.out.print(c + " " + a/c*b);
    }
}
