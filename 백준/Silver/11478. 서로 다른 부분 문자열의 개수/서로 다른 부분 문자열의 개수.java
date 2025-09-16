import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		Set<String> set = new HashSet<>();
		
		for (int i=1; i<=s.length(); i++) {
		    for (int k=0; k+i<=s.length(); k++) {
		        set.add(s.substring(k, k+i));        
		    }
		}
		System.out.print(set.size());
	}
}
