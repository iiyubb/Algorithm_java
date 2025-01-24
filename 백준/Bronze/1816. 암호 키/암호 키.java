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
			boolean flag = false;
			long pw = Long.parseLong(br.readLine());
			
			for (int k=2; k<1000002; k++) {
				if (pw % k == 0) {
					flag = false;
					break;

				} else {
					flag = true;
				}
			}

			if (flag) System.out.println("YES");
			else System.out.println("NO");
		}
	}

}
