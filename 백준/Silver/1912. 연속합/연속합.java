import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] prefix = new int[n+1];
		prefix[0] = -1000000;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			int a = Integer.parseInt(st.nextToken());
			prefix[i+1] = Math.max(prefix[i] + a, a);
		}
		
		System.out.println(Arrays.stream(prefix).max().orElse(0));
		
		
	}

}
