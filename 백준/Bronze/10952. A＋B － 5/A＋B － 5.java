import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		
		while (true) {
			String input = bf.readLine();
			int a = Integer.parseInt(input.split(" ")[0]);
			int b = Integer.parseInt(input.split(" ")[1]);
			
			if ((a==0) && (b==0)) {
				break;
			} else {
				bw.write(a+b+"\n");
			}
			
		}
		
		bw.flush();
		bw.close();

		
	}

}
