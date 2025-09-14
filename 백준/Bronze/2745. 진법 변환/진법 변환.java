import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		String n = arr[0];
		int b = Integer.parseInt(arr[1]);
		int result = 0;
		
		for (int i=0; i<n.length(); i++) {
		    if (n.charAt(i) > '9') {
		        result += (n.charAt(i) - 55) * Math.pow(b, n.length()-1-i);    
		    } else {
		        result += (n.charAt(i) - 48) * Math.pow(b, n.length()-1-i);
		    }
		}
		
		System.out.print(result);
	}
}
