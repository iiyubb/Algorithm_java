import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int num = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            String[] arr = new String[1000];
            for (int i=0; i<1000; i++) {
                arr[i] = st.nextToken();
            }

            HashMap<String, Integer> map = new HashMap<>();
            for (String a : arr) {
                if (map.containsKey(a)) {
                    int value = map.get(a);
                    map.replace(a, value+1);
                } else {
                    map.put(a, 1);
                }
            }

            int max = 0;
            int ans = 0;
            for (Entry<String, Integer> entry : map.entrySet()) {
                int key = Integer.parseInt(entry.getKey());
                if (entry.getValue() > max || (entry.getValue() == max && key > ans)) {
                    max = entry.getValue();
                    ans = key;
                }
            }
            System.out.println("#" + num + " " + ans);
        }
    }
}
