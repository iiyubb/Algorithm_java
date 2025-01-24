import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int ans = n;
		int i = 2;
		while ((int)Math.sqrt(ans) > 1) {
			if (ans % i == 0) {
				ans = ans / i;
				System.out.println(i);
				i = 2;
			} else {
				i++;
			}
		}
		for (int j=2; j<=ans; j++) {
			if (ans % j == 0) {
				System.out.println(j);
			}
		}
		
		
	}

}
