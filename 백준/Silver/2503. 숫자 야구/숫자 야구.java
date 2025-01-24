import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		boolean arr[] = new boolean[1000];
		
		for (int k=123; k<988; k++) {
			int fir = k/100;
			int sec = (k%100)/10;
			int thi = (k%100)%10;
			
			if ((sec == 0) || (thi == 0)) continue;
			
			if ((fir != sec) && (sec != thi) && (thi != fir)) arr[k] = true;
		}
				
		for (int i=0; i<n; i++) {
			String input = br.readLine();
			int min = Integer.parseInt(input.split(" ")[0]);
			int strike = Integer.parseInt(input.split(" ")[1]);
			int ball = Integer.parseInt(input.split(" ")[2]);
			
			for (int k=123; k<988; k++) {
				if (arr[k]) {
					int checkS = 0;
					int checkB = 0;
					
					int fir = k/100;
					int sec = (k%100)/10;
					int thi = (k%100)%10;
					
					if ((min/100) == fir) {
						checkS++;
					} 
					if ((min/100) == sec) checkB++;
					if ((min/100) == thi) checkB++;
	
					if ((min%100)/10 == sec) {
						checkS++;
					} 
					if (((min%100)/10) == fir) checkB++;
					if (((min%100)/10) == thi) checkB++;
					
					if ((min%100)%10 == thi) {
						checkS++;
					} 
					if (((min%100)%10) == fir) checkB++;
					if (((min%100)%10) == sec) checkB++;
					
					if ((checkS == strike) && (checkB == ball)) {
						arr[k] = true; 
//						System.out.println(k);
					}
					else arr[k] = false;
				}
			}
		
		}
		
		int count = 0;
		for (int j=123; j<1000; j++) {
			if (arr[j]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
