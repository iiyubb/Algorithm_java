import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] arr = new int[9][9];
		int max = 0;
		int rows = 0;
		int cols = 0;
		
		for (int i=0; i<9; i++) {
			String input = br.readLine();
			for (int j=0; j<9; j++) {
				arr[i][j] = Integer.parseInt(input.split(" ")[j]);
			}
		}
		
		for (int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					rows = i;
					cols = j;
				}
			}
		}
		System.out.println(max);
		bw.write((rows+1) + " " + (cols+1) + "\n");
		bw.flush();
		bw.close();
	}

}
