import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		Long A = Long.parseLong(input.split(" ")[0]) - 1;
		Long B = Long.parseLong(input.split(" ")[1]);
		
		long tmpA = A;
		long tmpB = B;
		
		for (int i=1; i<100; i++) {
			tmpA += ((A/(long)Math.pow(2, i)) * ((long)Math.pow(2, i) - (long)Math.pow(2, (i-1))));
			
		}
		
		for (int j=1; j<100; j++) {
			tmpB += ((B/(long)Math.pow(2, j)) * ((long)Math.pow(2, j) - (long)Math.pow(2, (j-1))));
			
		}
		
		System.out.println(tmpB - tmpA);
	}
}
