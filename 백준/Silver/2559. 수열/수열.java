import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] prefix = new int[n+1];
	
		st = new StringTokenizer(br.readLine());
		
		for (int i=1; i<=n; i++) {
			int a = Integer.parseInt(st.nextToken());
			prefix[i] = prefix[i-1] + a;
		}
		
		int max = -100000000;
		
		for (int j=k; j<=n; j++) {
			int ans = prefix[j] - prefix[j-k];
			if (ans > max) {
				max = ans;
			}
			
		}
		System.out.println(max);
	}

}
