import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int test_case = 1; test_case <= T; test_case++)
        {

            int n = sc.nextInt();
            int m = n*n;

            int r = 0;
            int c = 0;
            int[][] arr = new int[n][n];
            arr[r][c] = 1;
            String direct = "right";

            for (int i=2; i<=m; i++) {
                while (true) {
                    if (direct.equals("right") && c+1 < n && arr[r][c+1]==0) {
                        arr[r][++c] = i;
                        break;
                    } else if (direct.equals("down") && r+1 < n && arr[r+1][c]==0) {
                        arr[++r][c] = i;
                        break;
                    } else if (direct.equals("left") && c-1 >= 0 && arr[r][c-1] == 0) {
                        arr[r][--c] = i;
                        break;
                    } else if (direct.equals("up") && r-1 >= 0 && arr[r-1][c]==0) {
                        arr[--r][c] = i;
                        break;
                    }
                    else {
                        if (direct.equals("right")) {
                            direct = "down";
                            continue;
                        } else if (direct.equals("down")) {
                            direct = "left";
                            continue;
                        } else if (direct.equals("left")) {
                            direct = "up";
                            continue;
                        } else if (direct.equals("up")) {
                            direct = "right";
                            continue;
                        }
                    }
                }
            }

            sb.append("#").append(test_case).append("\n");
            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}