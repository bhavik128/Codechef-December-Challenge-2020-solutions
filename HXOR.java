import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class HXOR {

    public static void main(String[] args) {
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            solve();
        }
        out.close();
    }

    private static void solve() {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = sc.readArray(n);
        if(n == 2) {
            while (x != 0 && arr[0] != 0) {
                int temp = Integer.highestOneBit(arr[0]);
                arr[0] ^= temp;
                arr[1] ^= temp;
                x--;
            }
            if(x%2 == 1) {
                arr[0] ^= 1;
                arr[1] ^= 1;
            }
        } else {
            int first = 0;
            while (x != 0 && first<n-1) {
                int temp = Integer.highestOneBit(arr[first]);
                int second = first+1;
                while (second<n-1) {
                    int temp1 = arr[second]^temp;
                    if(temp1<arr[second]) break;
                    second++;
                }
                arr[first] ^= temp;
                arr[second] ^= temp;
                x--;
                if(arr[first] == 0) {
                    while (first<n-1 && arr[first] == 0) first++;
                }
            }
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

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }
    }
}
