import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] sumArr = new int[n+1];
		st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<n; i++) {
		    int num = Integer.parseInt(st.nextToken());
		    sumArr[i+1] = sumArr[i] + num;
		}
		
		for (int j=0; j<m; j++) {
		    st = new StringTokenizer(br.readLine());
		    int start = Integer.parseInt(st.nextToken());
		    int end = Integer.parseInt(st.nextToken());
		    
		    System.out.println(sumArr[end] - sumArr[start-1]);
		}
	}
}
