import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
	    int[] arr = new int[n];
	    
	    StringTokenizer st;
	    
	    st = new StringTokenizer(br.readLine());
	    for (int i=0; i<n; i++) {
	        arr[i] = Integer.parseInt(st.nextToken());
	    }
	    Arrays.sort(arr);
	    
	    int m = Integer.parseInt(br.readLine());
	    st = new StringTokenizer(br.readLine());
	    for (int i=0; i<m; i++) {
	        int k = Integer.parseInt(st.nextToken());
	        boolean flag = false;
	        int start = 0;
	        int end = n-1;
	        
	        while (start <= end) {
	            int mid = (start + end) / 2;
	            int midV = arr[mid];
	            if (k > midV) {
	                start = mid + 1;
	            } else if (k < midV) {
	                end = mid - 1;
	            } else if (k == midV) {
	                flag = true;
	                break;
	            }
	        } 
	        if (flag) System.out.println(1);
	        else System.out.println(0);
	    }
	}
}
