import java.io.*;
import java.util.StringTokenizer;

public class recipe
{
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer s = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(s.nextToken());
        int x = Integer.parseInt(s.nextToken());
        int y = Integer.parseInt(s.nextToken());
        double ratio = (double)y/x;
        for (int i = 0; i < n; i ++)
        {
            s = new StringTokenizer(r.readLine());
            int a = Integer.parseInt(s.nextToken());
            pw.println(Math.round(a*ratio));
        }
        pw.close();
    }
}