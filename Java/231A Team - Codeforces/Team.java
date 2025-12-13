import java.io.*;
import java.util.StringTokenizer;

public class Team
{
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer s = new StringTokenizer(r.readLine());
        int[][] p = new int[Integer.parseInt(s.nextToken())][3];
        int problems = 0;
        for (int i = 0; i < p.length; i++)
        {
            int count = 0;
            s = new StringTokenizer(r.readLine());
            p[i][0] = Integer.parseInt(s.nextToken());
            count += p[i][0];
            p[i][1] = Integer.parseInt(s.nextToken());
            count += p[i][1];
            p[i][2] = Integer.parseInt(s.nextToken());
            count += p[i][2];
            if (count >= 2)
            {
                problems ++;
            }
        }
        pw.print(problems);
        pw.close();
    }
}