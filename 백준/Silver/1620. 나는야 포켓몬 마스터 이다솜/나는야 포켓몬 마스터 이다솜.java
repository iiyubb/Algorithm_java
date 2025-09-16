import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		
		for (int i=1; i<=n; i++) {
		    String str = br.readLine();
		    map1.put(i+"", str);    
		    map2.put(str, i+"");
		}
		
		for (int k=0; k<m; k++) {
		    String str = br.readLine();
		    if (map1.get(str) != null) {
		        sb.append(map1.get(str)).append("\n");
		    } else {
		        sb.append(map2.get(str)).append("\n");
		    }
		}
		System.out.print(sb.toString());
	}
}
