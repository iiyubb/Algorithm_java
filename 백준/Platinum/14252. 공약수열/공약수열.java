import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int count = 0;
		
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(str.split(" ")[i]);
		}
		Arrays.sort(arr);
		
		for (int i=0; i<n-1; i++) {
			if (gcd(arr[i], arr[i+1]) == 1) {
				continue;
			}
			
			boolean flag = true;
			for (int j=arr[i]+1; j<arr[i+1]; j++) {
				if ((gcd(arr[i], j) == 1) && (gcd(j, arr[i+1]) == 1)) {
					flag = false;
					break;
				}
			}
			count++;
			if (flag) count++;
		}
		System.out.println(count);

	}
	
	private static int gcd(int a, int b) {
		while (a % b != 0) {
			int tmp = a % b;
			a = b;
			b = tmp;
		}
		return b;
	}

}
