import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            String num;
            
            if (n % h == 0) {
                if (n / h < 10) {
                    num = h + "0" + (n/h);
                } else {
                    num = h + "" + (n/h);
                }
            } else {
                if (n / h < 9) {
                    num = (n % h) + "0" + ((n/h) + 1);
                } else {
                    num = (n % h) + "" + ((n/h) + 1);
                }
            }
            System.out.println(num);
		}
	}
}
