import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int n = Integer.parseInt(br.readLine());
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int[] arr = new int[n];
	
	for (int i=0; i<n; i++) {
		arr[i] = Integer.parseInt(st.nextToken());
	}
	
	int min = arr[0];
	int max = arr[0];
	for (int j=0; j<arr.length; j++) {
		if (arr[j] > max) {
			max = arr[j];
		}
		
		if (arr[j] < min) {
			min = arr[j];
		}
	}
	
	bw.write(min + " " + max);
	bw.flush();
	bw.close();

	}

}
