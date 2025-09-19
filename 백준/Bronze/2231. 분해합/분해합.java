import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        int result = n;
        for (int num=1; num<n; num++) {
            if (num < 100) {
                if ((num + num / 10 + num % 10) == n) {
                    if (result > num) result = num;
                }
            } else if (num < 1000) {
                if ((num + num/100 + num % 100 / 10 + num % 10) == n) {
                    if (result > num) result = num;
                }
            } else if (num < 10000) {
                if ((num + num/1000 + num % 1000 / 100 + num % 100 / 10 + num % 10) == n) {
                    if (result > num) result = num;
                }
            } else if (num < 100000) {
                if ((num + num/10000 + num % 10000 / 1000 + num % 1000 / 100 + num % 100 / 10 + num % 10) == n) {
                    if (result > num) result = num;
                }
            } else if (num < 1000000) {
                if ((num + num/100000 + num % 100000 / 10000 + num % 10000 / 1000 + num % 1000 / 100 + num % 100 / 10 + num % 10) == n) {
                    if (result > num) result = num;
                }
            }
        }
        
        if (result == n) {
            System.out.print(0);
        } else {
		    System.out.print(result);
        }
	}
}
