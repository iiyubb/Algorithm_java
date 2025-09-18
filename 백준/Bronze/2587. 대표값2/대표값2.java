import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 5;
		
		List<Integer> arr = new ArrayList<>();
		int sum = 0;
		for (int i=0; i<n; i++) {
		    int k = Integer.parseInt(br.readLine());
		    arr.add(k);
		    sum += k;
		}
		
		Collections.sort(arr);
		
		System.out.println(sum / 5);
		System.out.println(arr.get(2));
	}
}
