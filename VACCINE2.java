import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class VACCINE2 {

    public static void main(String[] args) {
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            solve();
        }
        out.close();
    }

    private static void solve() {
        int N = sc.nextInt();
        int D = sc.nextInt();
        int[] arr = sc.readArray(N);
        int atRisk = 0;
        int notAtRisk = 0;
        for(int i : arr) {
            if(i>=80 || i<=9) atRisk++;
            else notAtRisk++;
        }
        long days = 0;
        days += (int)Math.ceil((double) atRisk/D);
        days += (int)Math.ceil((double) notAtRisk/D);
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

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }
    }
}
