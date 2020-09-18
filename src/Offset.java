import java.util.Arrays;
import java.util.Scanner;

public class Offset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int[][] dpary = new int[5][5];
		int[][] dpary = {{3,4,1,4,9},{2,9,4,5,8},{9,0,8,2,1},{7,0,2,8,4},{2,7,2,1,4}};
		/*for (int i = 0; i < dpary.length; i++) {
			for (int j = 0; j < dpary[i].length; j++) {
				dpary[i][j] = sc.nextInt();
			}
		}*/
		
		for (int i = 0; i < dpary.length; i++) {
			for (int j = 0; j < dpary[i].length; j++) {
				Boolean flag = true;
				if (j < 1) {
					if (i < 1) {
				 		if (dpary[i][j] < dpary[i][j + 1]) {
							flag = false;
						} else if (dpary[i][j] < dpary[i + 1][j]) {
							flag = false;
						}
						if (flag == false) {
							System.out.print("*" + " ");
						} else {
							System.out.print(dpary[i][j] + " ");
						}
					} else if (i == 4) {
						if (dpary[i][j] < dpary[i - 1][j]) {
							flag = false;
						} else if (dpary[i][j] < dpary[i][j + 1]) {
							flag = false;
						}
						if (flag == false) {
							System.out.print("*" + " ");
						} else {
							System.out.print(dpary[i][j] + " ");
						}

					} else {
						if (dpary[i][j] < dpary[i - 1][j]) {
							flag = false;
						} else if (dpary[i][j] < dpary[i + 1][j + 1]) {
							flag = false;
						} else if (dpary[i][j] < dpary[i + 1][j]) {
							flag = false;
						}

					}
				} else if (j == 4) {
					if (i < 1) {
						if (dpary[i][j] < dpary[i][j-1]) {
							flag = false;
						} else if (dpary[i][j] < dpary[i + 1][j]) {
							flag = false;
						}
						if (flag = false) {
							System.out.print("*" + " ");
						} else {
							System.out.print(dpary[i][j] + " ");
						}
					} else if (i == 4) {
						if (dpary[i][j] < dpary[i - 1][j]) {
							flag = false;
						} else if (dpary[i][j] < dpary[i][j - 1]) {
							flag = false;
						}
						if (flag == false) {
							System.out.print("*" + " ");
						} else {
							System.out.print(dpary[i][j] + " ");
						}

					} else {
						if (dpary[i][j] < dpary[i - 1][j]) {
							flag = false;
						} else if (dpary[i][j] < dpary[i][j-1]) {
							flag = false;
						} else if (dpary[i][j] < dpary[i + 1][j]) {
							flag = false;
						}
						
						if (flag == false) {
							System.out.print("*" + " ");
						} else {
							System.out.print(dpary[i][j] + " ");
						}
					}
				} else {
					if (i == 0) {
						if (dpary[i][j] < dpary[i][j-1]) {
							flag = false;
						} else if (dpary[i][j] < dpary[i + 1][j]) {
							flag = false;
						} else if (dpary[i][j] < dpary[i][j+1]) {
							flag = false;
						}
						
						if (flag == false) {
							System.out.print("*" + " ");
						} else {
							System.out.print(dpary[i][j] + " ");
						}
					} else if (i == 4) {
						if (dpary[i][j] < dpary[i][j-1]) {
							flag = false;
						} else if (dpary[i][j] < dpary[i-1][j]) {
							flag = false;
						} else if (dpary[i][j] < dpary[i][j+1]) {
							flag = false;
						}
						
						if (flag == false) {
							System.out.print("*" + " ");
						} else {
							System.out.print(dpary[i][j] + " ");
						}
						
					} else {
						if (dpary[i][j] < dpary[i][j-1]) {
							flag = false;
						} else if (dpary[i][j] < dpary[i-1][j]) {
							flag = false;
						} else if (dpary[i][j] < dpary[i][j+1]) {
							flag = false;
						} else if (dpary[i][j] < dpary[i+1][j]) {
							flag = false;
						}
						
						if (flag == false) {
							System.out.print("*" + " ");
						} else {
							System.out.print(dpary[i][j] + " ");
						}
					}

				}

				//System.out.print(dpary[i][j]);
			}
			System.out.println();
		}

	}

}
