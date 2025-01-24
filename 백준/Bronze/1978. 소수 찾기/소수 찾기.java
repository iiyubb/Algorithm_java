import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int answer = 0;
		for (int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			int tmp = 0;
			for (int j=1; j<=num; j++) {
				if (num % j == 0) {
					tmp++;
				}
			}
			if (tmp == 2) {
				answer++;
			}
		}
		System.out.println(answer);
		
	}

}
