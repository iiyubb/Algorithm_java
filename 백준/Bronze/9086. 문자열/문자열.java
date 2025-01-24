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
		
		for (int i=0; i<n; i++) {
			String input = br.readLine();
			bw.write(input.charAt(0));
			bw.write(input.charAt(input.length()-1));
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		
	}

}
