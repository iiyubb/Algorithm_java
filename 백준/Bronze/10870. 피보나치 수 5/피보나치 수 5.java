import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
        int n = Integer.parseInt(br.readLine());
        System.out.print(recur(n));
	}
	
	public static int recur(int n) {
	    if (n == 0) return 0;
	    else if (n == 1) return 1;
        return recur(n-1) + recur(n-2);
	}
}
