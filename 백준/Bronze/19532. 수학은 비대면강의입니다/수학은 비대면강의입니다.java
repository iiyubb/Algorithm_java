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
		int a = Integer.parseInt(input.split(" ")[0]);
		int b = Integer.parseInt(input.split(" ")[1]);
		int c = Integer.parseInt(input.split(" ")[2]);
		int d = Integer.parseInt(input.split(" ")[3]);
		int e = Integer.parseInt(input.split(" ")[4]);
		int f = Integer.parseInt(input.split(" ")[5]);
		
		for (int i=-999; i<1000; i++) {
			for (int j=-999; j<1000; j++) {
				if ((a * i + b * j == c) && (d * i + e * j == f)) {
					bw.write(i + " " + j);
				}
			}
		}
		bw.flush();
		bw.close();
	}

}
