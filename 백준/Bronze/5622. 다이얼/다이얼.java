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
		
		int sum = 0;
		for (int i=0; i<input.length(); i++) {
			if (((int)input.charAt(i) > 64) && ((int)input.charAt(i) < 68)) {
				sum += 3;
			} else if (((int)input.charAt(i) > 67) && ((int)input.charAt(i) < 71)) {
				sum += 4;
			} else if (((int)input.charAt(i) > 70) && ((int)input.charAt(i) < 74)) {
				sum += 5;
			} else if (((int)input.charAt(i) > 73) && ((int)input.charAt(i) < 77)) {
				sum += 6;
			} else if (((int)input.charAt(i) > 76) && ((int)input.charAt(i) < 80)) {
				sum += 7;
			} else if (((int)input.charAt(i) > 79) && ((int)input.charAt(i) < 84)) {
				sum += 8;
			} else if (((int)input.charAt(i) > 83) && ((int)input.charAt(i) < 87)) {
				sum += 9;
			} else if (((int)input.charAt(i) > 86) && ((int)input.charAt(i) < 91)) {
				sum += 10;
			} 
		}
		
		System.out.println(sum);

	}

}
