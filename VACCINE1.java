import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class VACCINE1 {

    public static void main(String[] args) {
        solve();
        out.close();
    }

    private static void solve() {
        int D1 = sc.nextInt();
        int V1 = sc.nextInt();
        int D2 = sc.nextInt();
        int V2 = sc.nextInt();
        int P = sc.nextInt();
        int days = 0;
        days += Math.min(D1,D2)-1;
        if(D1>D2) {
            int temp = D1-D2;
            if(V2*temp < P) {
                P -= (V2*temp);
                days += temp;
            } else {
                days += (int)Math.ceil((double) P/V2);
                P = 0;
            }
        } else if(D1<D2) {
            int temp = D2-D1;
            if(V1*temp < P) {
                P -= (V1*temp);
                days += temp;
            } else {
                days += (int)Math.ceil((double) P/V1);
                P = 0;
            }
        }

        days += (int)(Math.ceil((double) P/(V1+V2)));
        out.println(days);
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
    }
}
