import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        File input = new File("input.txt");
        try {
            String inLine;
            BufferedReader br = new BufferedReader(new FileReader(input));
            while ((inLine = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(inLine);
                while (st.hasMoreTokens()) {
                    String tempP = st.nextToken();
                    ArrayList<Integer> P = new ArrayList<>();
                    for (int a = 0; a < tempP.length(); ++a) {
                        P.add(tempP.charAt(a) - '0');
                    }
                    int N = P.size() - (Integer.parseInt(st.nextToken()));
                    ArrayList<Integer> result = new ArrayList<>();
                    for (int a = 0; a < P.size(); ++a) {
                        if (a < N) {
                            result.add(P.get(a) % 10);
                        } else if (a == N) {
                            result.add(P.get(a));
                        } else {
                            result.add(Math.abs(P.get(a) - P.get(N)));
                        }
                    }
                    for (Integer integer : result) System.out.print(integer);
                    System.out.println();
                }
            }
            //BOB
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
