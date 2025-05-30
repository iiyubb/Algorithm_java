import java.io.*;
import java.util.*;

public class Main {

  static int[] parents;

  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());
    parents = new int[n+1];

    // 초기화
    for(int i=1; i<n+1; i++) {
      parents[i] = i;
    }

    for(int i=1; i<n+1; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j=1; j<n+1; j++) {
        int num = Integer.parseInt(st.nextToken());
        if(num == 1) {
          union(i, j);
        }
      }
    }

    st = new StringTokenizer(br.readLine());
    int root = find(Integer.parseInt(st.nextToken()));
    for (int i=0; i<m-1; i++) {
      int num = Integer.parseInt(st.nextToken());
      if (root != find(num)) {
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
  }

  static int find(int x) {
    if (x == parents[x]) return x;
    return parents[x] = find(parents[x]);
  }

  static void union(int x, int y) {
    int rootX = find(x);
    int rootY = find(y);

    if (rootX != rootY) {
      if (rootX < rootY) {
        parents[rootY] = rootX;
      } else {
        parents[rootX] = rootY;
      }
    }
  }
}