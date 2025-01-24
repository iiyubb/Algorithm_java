import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int a = Integer.parseInt(input.split(" ")[0]);
		int b = Integer.parseInt(input.split(" ")[1]);
		
		int aRev = a%10 * 100 + (a/10)%10 * 10 + a/100;
		int bRev = b % 10 * 100 + (b/10)%10 * 10 + b/100;
		

		if (aRev > bRev) {
			System.out.print(aRev);
		} else {
			System.out.println(bRev);
		}
		

	}

}
