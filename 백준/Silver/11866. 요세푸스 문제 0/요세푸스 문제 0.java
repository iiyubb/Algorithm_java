import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		LinkedList<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for (int i=1; i<=n; i++) {
		    queue.add(i);
		}
		
		int i = 0;
		while(!queue.isEmpty()) {
		    i = (i + k - 1) % queue.size();
		    sb.append(queue.remove(i));
		    
		    if (!queue.isEmpty()) {
		        sb.append(", ");
		    }
		}
        sb.append(">");
        System.out.print(sb.toString());
	} 
}