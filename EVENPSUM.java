import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class EVENPSUM {

    public static void main(String[] args) {
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            solve();
        }
        out.close();
    }

    private static void solve() {
        int A = sc.nextInt();
        int B = sc.nextInt();
        long count = 0;
        long oddInA,oddInB,evenInA,evenInB;
        if(A%2 == 0) {
            oddInA = A/2;
            evenInA = A/2;
        } else {
            oddInA = A/2 + 1;
            evenInA = A - oddInA;
        }

        if(B%2 == 0) {
            oddInB = B/2;
            evenInB = B/2;
        } else {
            oddInB = B/2 + 1;
            evenInB = B - oddInB;
        }
        count += (oddInA*oddInB);
        count += (evenInA*evenInB);
        out.println(count);
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
