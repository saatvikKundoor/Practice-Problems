import java.io.*;
import java.util.StringTokenizer;

public class SoldiersandBananas
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer s = new StringTokenizer(r.readLine());
        int k = Integer.parseInt(s.nextToken());
        int n = Integer.parseInt(s.nextToken());
        int w = Integer.parseInt(s.nextToken());
        int total = 0;
        for (int i = 1; i <= w; i++)
        {
            total += i * k;
        }
        if (n >= total)
        {
            pw.print(0);
        }
        else{
            pw.print(total - n);
        }
        pw.close();
    }
}