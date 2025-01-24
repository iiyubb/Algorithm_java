import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for (int i=1; i<n+1; i++) {
			int star = i * 2 -1;
			int blank = (2*n-1 - star) / 2;
			
			for (int j=0; j<blank; j++) {
				bw.write(" ");
			}
			for (int k=0; k<star; k++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		for (int i=n+1; i<2*n; i++) {
			int blank = i - n;
			int star = 2 * n - 1 - blank * 2;
			
			for (int j=0; j<blank; j++) {
				bw.write(" ");
			}
			for (int k=0; k<star; k++) {
				bw.write("*");
			}
			if (i == 2*n-1) {
				break;
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();

	}

}
