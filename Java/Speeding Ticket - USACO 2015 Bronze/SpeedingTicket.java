import java.io.*;
import java.util.StringTokenizer;

public class SpeedingTicket
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new FileReader("speeding.in"));
        PrintWriter pw = new PrintWriter("speeding.out");

        StringTokenizer s = new StringTokenizer(r.readLine());

        int n = Integer.parseInt(s.nextToken());
        int m = Integer.parseInt(s.nextToken());
        int[][] nSegments = new int[n][2];
        int[][] mSegments = new int[m][2];
        int difference = 0;
        for (int i = 0; i < n; i++)
        {
            s = new StringTokenizer(r.readLine());
            nSegments[i][0] = Integer.parseInt(s.nextToken());
            nSegments[i][1] = Integer.parseInt(s.nextToken());
        }
        for (int i = 0; i < m; i++)
        {
            s = new StringTokenizer(r.readLine());
            mSegments[i][0] = Integer.parseInt(s.nextToken());
            mSegments[i][1] = Integer.parseInt(s.nextToken());
        }
        int[] limits = new int[100];
        int start = 0;
        for (int[] l : nSegments)
        {
            for (int i =0; i < l[0]; i ++)
            {
                limits[start + i] = l[1];
                
            }
            start += l[0];
        }
        int[] speeds = new int[100];
        start = 0;
        for (int[] l : mSegments)
        {
            for (int i =0; i < l[0]; i ++)
            {
                speeds[start + i] = l[1];
                
            }
            start += l[0];
        }
        for (int i = 0; i < 100; i++)
        {
            difference = Math.max(difference, speeds[i] - limits[i]);
        }
        pw.print(difference);
        pw.close();
    }

}