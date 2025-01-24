import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		boolean[] remainder = new boolean[42];
		
		for (int i=0; i<10; i++) {
			int a = Integer.parseInt(br.readLine());
			remainder[a % 42] = true;
		}
		
		int count = 0;
		
		for (int j=0; j<42; j++) {
			if (remainder[j]) count ++;
		}
		
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}

}
