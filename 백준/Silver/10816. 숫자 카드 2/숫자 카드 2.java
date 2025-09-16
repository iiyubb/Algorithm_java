import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> map = new HashMap<>();
	
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
		    int k = Integer.parseInt(st.nextToken());
		    if (map.containsKey(k)) {
		        map.put(k, map.get(k)+1);
		    } else {
		        map.put(k, 1);
		    }
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<m; i++) {
		    int p = Integer.parseInt(st.nextToken());
		    if (map.get(p) == null) {
		        sb.append(0).append(" ");
		    } else {
		        sb.append(map.get(p)).append(" ");
		    }
		}
		System.out.print(sb.toString());
	} 
} 