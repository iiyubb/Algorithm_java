import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());
    int[][] map = new int[n][n];

    for (int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j=0; j<n; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int k=0; k<n; k++) {
      for (int l=0; l<n; l++) {
        for (int m=0; m<n; m++) {
          if (map[l][k] == 1 && map[k][m] == 1) {
            map[l][m] = 1;
          }
        }
      }
    }

    for (int i=0; i<n; i++) {
      for (int j=0; j<n; j++) {
        sb.append(map[i][j] + " ");
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }

}
