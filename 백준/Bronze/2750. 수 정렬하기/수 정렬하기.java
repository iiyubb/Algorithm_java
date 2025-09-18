import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> arr = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
		    int k = Integer.parseInt(br.readLine());
		    arr.add(k);
		}
		
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<n; i++) {
		    sb.append(arr.get(i)).append("\n");
		}
		
		System.out.print(sb.toString());
	}
}
