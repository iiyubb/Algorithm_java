import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		
		int n = Integer.parseInt(str.split(" ")[0]);
		int m = Integer.parseInt(str.split(" ")[1]);
		
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		
		for (int i=0; i<n; i++) {
			String input = br.readLine();
			for (int j=0; j<m; j++) {
				a[i][j] = Integer.parseInt(input.split(" ")[j]);
			}
		}
		for (int i=0; i<n; i++) {
			String input = br.readLine();
			for (int j=0; j<m; j++) {
				b[i][j] = Integer.parseInt(input.split(" ")[j]);
			}
		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				bw.write(a[i][j] + b[i][j] + " ");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}

}
