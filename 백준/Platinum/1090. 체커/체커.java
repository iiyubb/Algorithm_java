import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer N = Integer.parseInt(br.readLine());
		int[] answer = new int[N];
		Arrays.fill(answer, Integer.MAX_VALUE);
		List<int[]> inputs = new ArrayList<>();
		
		int[] X = new int[N];
		int[] Y = new int[N];
		
		for (int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			inputs.add(new int[] {x, y});
			X[i] = x;
			Y[i] = y;
		}
		
		for (int x = 0; x < X.length; x++) {
			for (int y=0; y<Y.length; y++) {
				int x1 = X[x];
				int y1 = Y[y];
				List<Integer> list = new ArrayList<>();
				
				for (int[] input : inputs) {
					int a = input[0];
					int b = input[1];
					
					int xResult = Math.abs(x1-a);
					int yResult = Math.abs(y1-b);
					list.add(xResult + yResult);
				}
				
				list.sort(Comparator.naturalOrder());
				int sum = 0;
				
				for (int i=0; i<list.size(); i++) {
					sum += list.get(i);
					
					answer[i] = Math.min(answer[i], sum);
				}
				
			}
		}
		
		for (int i=0; i<N; i++) {
			System.out.print(answer[i]);
			if (i < N -1) {
				System.out.print(" ");
			}
		}
	}

}
