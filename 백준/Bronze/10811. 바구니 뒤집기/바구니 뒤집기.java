import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		
		int[] basket = new int[n];
		for (int l=0; l<n; l++) {
			basket[l] = l+1;
		}
		
		for (int k=0; k<m; k++) {
			String input = br.readLine();
			int i = Integer.parseInt(input.split(" ")[0])-1;
			int j = Integer.parseInt(input.split(" ")[1])-1;
			
			while(j > i) {
				int temp = basket[i];
				basket[i] = basket[j];
				basket[j] = temp;
				i++;
				j--;
			}
			
		}
		
		for (int l=0; l<n; l++) {
			bw.write(basket[l] + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
