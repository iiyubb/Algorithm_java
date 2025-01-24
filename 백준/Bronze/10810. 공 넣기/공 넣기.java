import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		int n = Integer.parseInt(input.split(" ")[0]);
		int m = Integer.parseInt(input.split(" ")[1]);
		
		// array 초기
		int[] basket = new int[n];
		for (int k=0; k<basket.length; k++) {
			basket[k] = 0;
		}
		
		for (int i=0; i<m; i++) {
			String input2 = br.readLine();
			int start = Integer.parseInt(input2.split(" ")[0]) - 1;
			int end = Integer.parseInt(input2.split(" ")[1]);
			int ball = Integer.parseInt(input2.split(" ")[2]);
			
			for (int j=start; j<end; j++) {
				basket[j] = ball;
			}
			
		}
		
		for (int k=0; k<basket.length; k++) {
			bw.write(basket[k] + " ");
		}
		bw.flush();
		bw.close();
	}

}
