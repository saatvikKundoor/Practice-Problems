import java.io.*;
import java.util.StringTokenizer;

public class WeirdAlgorithm
{
    public static void main(String args[]) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        Long a = Long.parseLong(r.readLine());
        while (a != 1)
        {
            pw.print(a + " ");
            if (a%2 == 0)
            {
                a /= 2;
            }
            else {
                a *=3;
                a ++;
            }
            
        }
        pw.print(a + " ");
        pw.close();
    }
}