import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class POSPREFS {

    public static void main(String[] args) {
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            solve();
        }
        out.close();
    }

    private static void solve() {
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0;i<N;i++) {
            arr[i] = i+1;
        }
        int times = N-K;
        int i,j;
        if(K%2 == 0) {
            i = 1;
            if(N%2 == 0) j = N-2;
            else j = N-1;
        } else {
            i = 0;
            if(N%2 == 0) j = N-1;
            else j = N-2;
        }

        while (i<N && times != 0) {
            arr[i] = -arr[i];
            i += 2;
            times--;
        }
        while (j>=0 && times != 0) {
            arr[j] = -arr[j];
            j -= 2;
            times--;
        }

        for(int a : arr) {
            out.print(a+" ");
        }
        out.println();
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
