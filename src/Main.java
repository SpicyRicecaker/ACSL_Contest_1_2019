import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        String inLine;
        BufferedReader br = new BufferedReader(new FileReader(new File("input.txt")));
        while ((inLine = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(inLine);
            while (st.hasMoreTokens()) {
                String P = st.nextToken();
                int N = P.length() - (Integer.parseInt(st.nextToken()));
                for (int a = 0; a < P.length(); ++a) {
                    if (a < N) {
                        System.out.print(((P.charAt(a) - '0') + (P.charAt(N) - '0')) % 10);
                    } else if (a == N) {
                        System.out.print(P.charAt(a) - '0');
                    } else {
                        System.out.print(Math.abs((P.charAt(a) - '0') - (P.charAt(N) - '0')));
                    }
                }
                System.out.println();
            }
        }
        br.close();
    }
}
