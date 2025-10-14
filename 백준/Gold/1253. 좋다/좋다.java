import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
	    int[] arr = new int[n];
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    for (int i=0; i<n; i++) {
	        arr[i] = Integer.parseInt(st.nextToken());
	    }
	    
	    Arrays.sort(arr);
		
		int count = 0;
		
		for (int i=0; i<n; i++) {
		    int start = 0;
		    int end = n-1;
		    
		    while (start < end) {
		        if (arr[start] + arr[end] == arr[i]) {
		            if (start != i && end != i) {
		                count++;
		                break;
		            } else if (start == i) {
		                start++;
		            } else if (end == i) {
		                end--;
		            }
		        }
		        else if (arr[start] + arr[end] > arr[i]) {
		            end--;
		        } else if (arr[start] + arr[end] < arr[i]) {
		            start++;
		        }
		    }
		}
		System.out.println(count);
	}
}
