import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] student = new int[30];
		
		for (int i=0; i<28; i++) {
			int num = Integer.parseInt(br.readLine());
			
			student[num-1] = 1;
		}
		
		int[] noAcc = {0, 0};
		for (int k=0; k<30; k++) {
			if (student[k] != 1) {
				if (noAcc[0] == 0) {
					noAcc[0] = k+1;
				} else {
					noAcc[1] = k+1;
				}
			}
		}
		
		if (noAcc[0] > noAcc[1]) bw.write(noAcc[1] + "\n" + noAcc[0]);
		else bw.write(noAcc[0] + "\n" + noAcc[1]);
		
		bw.flush();
		bw.close();
	}

}
