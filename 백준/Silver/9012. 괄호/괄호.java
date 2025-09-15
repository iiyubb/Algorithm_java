import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
		    String result = "NO";
		    boolean flag = false;
		    Stack<Character> stack = new Stack<>();
		    char[] arr = br.readLine().toCharArray();
		    
		    for (int k=0; k<arr.length; k++) {
		        if (arr[k] == '(') {
		            stack.push(arr[k]);
		        } else {
		            if (stack.isEmpty()) {
		                result = "NO";
		                flag = true;
		                break;
		            } else {
		                stack.pop();
		            }
		        }
		    }
		    if (flag) result = "NO";
		    else if (stack.isEmpty()) result = "YES";
		   
		    sb.append(result).append("\n");
		}
		System.out.print(sb.toString());
		
	} 
}