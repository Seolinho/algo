import java.util.Scanner;

public class Ddm {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] arr = new int[5][5];

		for (int[] row : arr) {
			for (int i = 0; i < row.length; i++) {
				row[i] = in.nextInt();
			}
		}
		in.close();

       /*
        primitive type 원시 자료형
           int, double, float, boolean, char
        Wrapper class
           Integer, Double, Boolean, Character
        */

		boolean isDDM = true;
		for (int y = 0; y < arr.length; y++) {
			int diagonalAbs = Math.abs(arr[y][y]);
			int otherSum = 0;
			for (int x = 0; x < arr[y].length; x++) {
				if (x == y) continue;
				otherSum += Math.abs(arr[y][x]);
			}
			if (diagonalAbs < otherSum) {
				isDDM = false;
				break;
			}
		}

		System.out.println(isDDM ? "yes" : "no");
	}
}