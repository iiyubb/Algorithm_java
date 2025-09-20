import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i<n; i++) {
            String s = br.readLine();
            System.out.println(isPalindrome(s));
        }
	}
	
	public static String recur(String s, int l, int r, int i) {
	    if (l >= r) return (1 + " " + i);
	    else if (s.charAt(l) != s.charAt(r)) return (0 + " " + i);
	    else {
	        i++;
	        return recur(s, l+1, r-1, i);
	    }
	}
	
	public static String isPalindrome(String s) {
	    return recur(s, 0, s.length()-1, 1);
	}
	
}
