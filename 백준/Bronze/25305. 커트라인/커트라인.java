import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Integer[] arr = new Integer[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
		    int tmp = Integer.parseInt(st.nextToken());
		    arr[i] = tmp;
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.print(arr[k-1]);
	}
}
