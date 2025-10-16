import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
	    st = new StringTokenizer(br.readLine());
	    int[] arr = new int[n];
	    int start = 0;
	    int end = 0;
	    for (int i=0; i<n; i++) {
	        arr[i] = Integer.parseInt(st.nextToken());
	        if (arr[i] > start) start = arr[i];
	        end += arr[i];
	    }
	    
	    while (start <= end) {
	        int count = 0;
	        int sum = 0;
	        int middle = (start + end) / 2;
	        
	        for (int i=0; i<n; i++) {
	            if (sum+arr[i] > middle) {
	                count++;
	                sum = 0;
	            }
	            sum += arr[i];
	        }
	        if (sum != 0) {
	            count++;
	        }
	        if (count > m) {
	            start = middle + 1;
	        } else {
	            end = middle - 1;
	        }
	    }
	    System.out.println(start);
	}
}
