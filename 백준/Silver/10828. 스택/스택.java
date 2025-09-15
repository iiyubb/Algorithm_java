import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> arr = new Stack<>();
		
		for (int i=0; i<n; i++) {
		    String input = br.readLine();
		    if (input.startsWith("push")) {
		        int t = Integer.parseInt(input.split(" ")[1]);
	            arr.push(t);
		    }
		    if (input.startsWith("top")) {
		        if (arr.isEmpty()) {
		            System.out.println(-1);
		        } else {
		            System.out.println(arr.peek());
		        }
		    }
		    if (input.startsWith("size")) {
		        System.out.println(arr.size());
		    }
		    if (input.startsWith("empty")) {
		        System.out.println(arr.isEmpty() == false ? 0 : 1);
		    }
		    if (input.startsWith("pop")) {
		        if (arr.isEmpty()) {
		            System.out.println(-1);
		        } else {
		            System.out.println(arr.pop());
		        }
		    }
		    
		}
	} 
}