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
		String[] arr = input.split(" ");
		int[] role = {1, 1, 2, 2, 2, 8};
		
		for (int i=0; i<arr.length; i++) {
			bw.write(role[i] - Integer.parseInt(arr[i]) + " ");
		}
		
		bw.flush();
		bw.close();
	}

}
