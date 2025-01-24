import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] sbArray;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		sbArray = new int[m];
		visit = new boolean[n+1];
		
		numericalSequence(0, n, m);
		System.out.println(sb);
	}
	
	public static void numericalSequence(int step, int n, int m) {
		if (step == m) {
			for (int num : sbArray) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i=1; i<n+1; i++) {
			if (visit[i] == false) {
				visit[i] = true;
				sbArray[step] = i;
				numericalSequence(step+1, n, m);
				visit[i] = false;
			}
		}
		
	}
}
