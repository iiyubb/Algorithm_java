import java.util.*;
import java.io.*;

public class Main {
  static int n;
  static ArrayList<int[]> tree[];
  static int max;
  static boolean[] visit;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    tree = new ArrayList[n+1];

    for (int i=1; i<n+1; i++) {
      tree[i] = new ArrayList<>();
    }

    StringTokenizer st;
    for (int i=0; i<n-1; i++) {
      st = new StringTokenizer(br.readLine());
      int p = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      int w = Integer.parseInt(st.nextToken());

      tree[p].add(new int[]{c, w});
      tree[c].add(new int[]{p, w});
    }

    for (int i=1; i<tree.length; i++) {
      visit = new boolean[n + 1];
      dfs(i, 0);
    }

    System.out.println(max);
  }

  static void dfs(int node, int distance) {
    visit[node] = true;
    max = Math.max(distance, max);

    for (int[] t : tree[node]) {
      if (!visit[t[0]]) {
        dfs(t[0], distance + t[1]);
      }
    }
  }

}
