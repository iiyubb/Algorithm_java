import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Set<String> arr = new HashSet<>();
		List<String> result = new ArrayList<>();
		int num = 0;
		
		for (int i=0; i<n+m; i++) {
		    String str = br.readLine();
		    if (arr.contains(str)) {
		        num += 1;
		        result.add(str);
		    } else {
		        arr.add(str);
		    }
		}
		
		System.out.println(num);
		Collections.sort(result);
		for (String tmp : result) {
		    System.out.println(tmp);
		}
	} 
} 