import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int candy = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		for (int t=1; t<candy; t++) {
			for (int y=1; y<candy; y++) {
				for (int n=1; n<candy; n++) {
					
					if (t % 2 == 1) {
						continue;
					}
					if (n < y+2) {
						continue;
					}
					if (t + y + n != candy) {
						continue;
					}
					count++;
				}
			}	
		}
		System.out.println(count);

	}

}
