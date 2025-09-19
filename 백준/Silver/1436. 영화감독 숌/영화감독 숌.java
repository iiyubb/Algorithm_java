import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		int i = 666;
        while (count < n) {
            if ((i+"").contains("666")) {
                count++;
                if (count == n) {
                    System.out.print(i);
                    break;
                }
            }
            i++;
        }
	}
}
