import java.util.Scanner;

public class Sum_rule {
	
	private static final int[] dx = {0,-1};
	private static final int[] dy = {-1,0};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub/
		//int 4byte 21��
		Scanner sc = new Scanner(System.in);
		int w,h;
		h = sc.nextInt();
		w = sc.nextInt();
		long[][] ary = new long[h][w];
		
		/*
		 * for (int y = 0; y < ary.length; y++) { for (int x = 0; x < ary[y].length;
		 * x++) { if(y==0 || x==0) { ary[y][x] = 1; } } }
		 */
		for (int x = 0; x < ary[0].length; x++) {
			ary[0][x] = 1;
		}
		for (int y = 0; y < h; y++) {
			ary[y][0] = 1;
		}
		
		for (int y = 1; y < ary.length; y++) {
			for (int x = 1; x < ary[y].length; x++) {
				long sum =0;
				for (int i = 0; i < dx.length; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					sum += ary[ny][nx];
				}
				ary[y][x]= sum;
			}
		}
		
		for(long[] row : ary) {
			for(long v : row) {
				System.out.print(v+" ");
			}
			System.out.println();
		}
		
	}

}
