import java.io.*;
import java.util.StringTokenizer;

public class FencePainting 
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader r = new BufferedReader(new FileReader("paint.in"));
        PrintWriter pw = new PrintWriter("paint.out");

        StringTokenizer s = new StringTokenizer(r.readLine());
        int[] l = new int[4];
        l[0] = Integer.parseInt(s.nextToken());
        l[1] = Integer.parseInt(s.nextToken());
        s = new StringTokenizer(r.readLine());
        l[2] = Integer.parseInt(s.nextToken());
        l[3] = Integer.parseInt(s.nextToken());
        if (l[1] < l[2] || l[3] < l[0])
        {
            pw.print((l[1] - l[0]) +(l[3]-l[2]));
        }
        else {
            int min = 100;
            int max = 0;
            for (int i = 0; i < l.length; i ++)
            {
                if (l[i] > max)
                {
                    max = l[i];
                }
                if (l[i] < min)
                {
                    min = l[i];
                }
            }
            pw.print(max - min);
        }   
        pw.close();
    }
}