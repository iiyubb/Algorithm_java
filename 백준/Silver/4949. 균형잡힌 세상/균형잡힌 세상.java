import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str;
        while (!(str = br.readLine()).equals(".")) {
		    char[] arr = str.toCharArray();
		    Stack<Character> stack = new Stack<>();
		    String result = "yes";
		    boolean flag = false;
		    
		    for (int i=0; i<arr.length; i++) {
		        if (arr[i] == '(' || arr[i] == '[') {
		            stack.push(arr[i]);
		        } else if (arr[i] == ')' || arr[i] == ']') {
		            if (stack.isEmpty()) {
		                flag = true;
		            } else if (arr[i] == ']') {
		                if (stack.pop() != '[') {
		                    flag = true;
		                }
		            } else if (arr[i] == ')') {
		                if (stack.pop() != '(') {
		                    flag = true;
		                }
		            }
		        }
		    }
		    if (!stack.isEmpty()) result = "no";
		    else if (flag) result = "no";
		    sb.append(result).append("\n");
		}
		System.out.print(sb.toString());
	} 
} 