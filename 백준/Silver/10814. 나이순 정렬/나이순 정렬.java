import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[n][2];
		
		for (int i=0; i<n; i++) {
		    st = new StringTokenizer(br.readLine());
		    arr[i][0] = st.nextToken();
		    arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, (a, b) ->
		    Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0])));
		
		for (int i=0; i<n; i++) {
		    sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
		}
		System.out.print(sb.toString());
	}
}
