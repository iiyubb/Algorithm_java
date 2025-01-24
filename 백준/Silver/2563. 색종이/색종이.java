import java.io.BufferedReader;


import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[100][100];
		for (int i=0; i<n; i++) {
			String str = br.readLine();
			
			int x = Integer.parseInt(str.split(" ")[0]); // column(x)
			int y = Integer.parseInt(str.split(" ")[1]); // raw(y)
			
			for (int c=x; c<x+10; c++) {
				for (int r=y; r<y+10; r++) {
					arr[r][c] = 1;
				}
			}
		}
		
		for (int i=0; i<100; i++) {
			for (int j=0; j<100; j++) {
				if (arr[i][j] == 1) {
					sum++;
				}
			}
		}
		
		System.out.println(sum);

	}

}
