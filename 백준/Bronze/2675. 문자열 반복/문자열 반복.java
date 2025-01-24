import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i=0; i<T; i++) {
			String input = br.readLine();
			int R = Integer.parseInt(input.split(" ")[0]);
			String S = input.split(" ")[1];
			
			for (int k=0; k<S.length(); k++) {
				for (int j=0; j<R; j++) {
					char repeat = S.charAt(k);
					bw.write(repeat);
				}
			}
			bw.write("\n");
			
		}
		bw.flush();
		bw.close();
		

	}

}
