import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		double[] score = new double[n];
		String input = br.readLine();
		
		for (int i=0; i<n; i++) {
			score[i] = Integer.parseInt(input.split(" ")[i]);
		}
		
		// max
		double max = score[0];
		for (int i=0; i<n; i++) {
			if (score[i] > max) max = score[i];
		}
		
		for (int i=0; i<n; i++) {
			score[i] = (score[i]/max) * 100;
		}
		
		double sum = 0;
		for (int i=0; i<n; i++) {
			sum += score[i];
		}
		
		double avg = sum / n;
		
		System.out.println(avg);
	}

}
