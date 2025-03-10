import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bf.readLine());
		
		for (int i = 1; i < T+1; i++) {
			for (int j=T-i-1; j>=0; j--) {
				bw.write(" ");
			}
				
			for (int k=1; k<=i; k++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();

	}

}
