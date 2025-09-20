import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
        int n = Integer.parseInt(br.readLine());
        recur(n, 1);
	}
	
	public static void recur(int n, int result) {
	    if (n < 1) System.out.print(result);
	    else recur(n-1, result*n);
	}

}
