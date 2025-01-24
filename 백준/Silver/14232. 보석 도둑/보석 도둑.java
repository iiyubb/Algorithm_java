import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Long k = Long.parseLong(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		int num = 0;
		
		int i = 2;
		while (k != 1) {
			if (i >= 100000) {
			
				sb.append(k+"");
				num++;
				break;
			}
			if (k % i == 0) {
				k /= i;
				num++;
				sb.append(i + " ");
			} else {
				i++;
			}
		}
		
		
		System.out.println(num);
		System.out.println(sb);
	}

}
