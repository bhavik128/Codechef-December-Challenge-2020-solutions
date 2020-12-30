import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class STROPERS {

    public static void main(String[] args) {
        int t = sc.nextInt();
        for(int i = 0;i<t;i++) solve();
        out.close();
    }

    private static void solve() {
        String str = sc.nextString();
        int n = str.length();
        Set<String> set = new HashSet<>();
        for(int i = 0;i<n;i++) {
            int count1=0,even=0,odd=0;
            for(int j = i;j<n;j++) {
                if(str.charAt(j) == '1') count1++;
                else {
                    if(count1%2 == 0) even++;
                    else odd++;
                }
                String temp = (j-i+1)+" "+odd+" "+even;
                set.add(temp);
            }
        }
        out.println(set.size());
    }

    private static final FastScanner sc = new FastScanner();
    private static final PrintWriter out = new PrintWriter(System.out);

    public static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        String nextString() {
            return next();
        }
    }
}
