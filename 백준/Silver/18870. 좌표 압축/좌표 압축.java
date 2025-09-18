import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		
		List<Integer> origin = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
		    int k = Integer.parseInt(st.nextToken());
		    origin.add(k);
		    set.add(k);
		}
		
		List<Integer> arr = new ArrayList<>(set);
		Collections.sort(arr);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i=0; i<arr.size(); i++) {
		    map.put(arr.get(i), i);
		}
		for (int t : origin) {
		    sb.append(map.get(t)).append(" ");
		}
		
		System.out.print(sb.toString());
	}
}
