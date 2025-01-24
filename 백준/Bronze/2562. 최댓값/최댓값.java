import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[9];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = arr[0];
		int idx = 0;
		for (int j=0; j<arr.length; j++) {
			if (arr[j] > max) {
				max = arr[j];
				idx = j;
			}
		}
		
		bw.write(max + "\n" + (idx+1));
		bw.flush();
		bw.close();

	}

}
