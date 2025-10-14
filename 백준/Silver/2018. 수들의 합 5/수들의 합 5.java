import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int count = 1;
		int start = 1;
		int end = 1;
		int sum = 1;
		
		while (end != n) {
		    if (sum < n) {
		        end++;
		        sum += end;
		    } else if (sum > n) {
		        sum -= start;
		        start++;
		    } else if (sum == n) {
		        count++;
		        end++;
		        sum += end;
		    }
		}
		System.out.println(count);
	}
}
