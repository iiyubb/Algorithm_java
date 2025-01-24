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
		
		int[] basket = new int[n];
		for (int k=0; k<n; k++) {
			basket[k] = k+1;
		}
		
		for (int l=0; l<m; l++) {
			String input2 = br.readLine();
			int i = Integer.parseInt(input2.split(" ")[0]);
			int j = Integer.parseInt(input2.split(" ")[1]);
			
			int tmp = basket[i-1];
			basket[i-1] = basket[j-1];
			basket[j-1] = tmp;
		}
		
		for (int p=0; p<basket.length; p++) {
			bw.write(basket[p] + " ");
		}
		bw.flush();
		bw.close();

	}

}
