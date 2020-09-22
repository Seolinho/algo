import java.util.Scanner;

public class Kakaolock {
    public static void main(String[] args) {
        Kakaolock kc = new Kakaolock();
        int[][] key = new int[3][3];
        int[][] lock = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int[] row : key) {
            for (int i = 0; i < key.length; i++) {
                row[i] = sc.nextInt();
            }
        }
        for (int[] row:lock) {
            for (int i = 0; i < lock.length; i++) {
                row[i] = sc.nextInt();
            }
        }
        sc.close();
        kc.solution(key, lock);
    }
    public boolean solution(int[][] key, int[][] lock) {
        boolean answer = true;

        return answer;
    }
}
