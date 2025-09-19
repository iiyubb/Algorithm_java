import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[n][m];
		
		for (int i=0; i<n; i++) {
		    arr[i] = br.readLine().toCharArray();
		}
		
		int min = Integer.MAX_VALUE;
		
		for (int sr=0; sr<=n-8; sr++) {
		    for (int sc=0; sc<=m-8; sc++) {
		        
		        int count1 = 0;
		        int count2 = 0;
		        for (int i=0; i<8; i++) {
		            for (int j=0; j<8; j++) {
		                char currentColor = arr[sr+i][sc+j];
		                char wantColor1 = ((i+j) % 2 == 0) ? 'W' : 'B';
		                if (currentColor != wantColor1) count1++;
		                
		                char wantColor2 = ((i+j) % 2 == 0) ? 'B' : 'W';
		                if (currentColor != wantColor2) count2++;
		            }
		        }
		        
		        min = Math.min(min, Math.min(count1, count2));
		    }
		}
		System.out.print(min);
	}
}
