import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		int sum = 0;
		for (int i=0; i<word.length(); i++) {
			if (word.charAt(i) == word.charAt(word.length()-i-1)) {
				sum++;
			}
		}
		if (sum == word.length()) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
