import java.io.*;

public class BucketBrigade
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader r = new BufferedReader(new FileReader("buckets.in"));
        PrintWriter pw = new PrintWriter("buckets.out");
        
        int bj=0;int bi=0;int rj=0;int ri=0;int lj=0;int li=0;
        for (int j = 0; j < 10; j++)
        {
            String row = r.readLine();
            for (int i = 0; i < 10; i++ )
            {
                if (row.charAt(i) == 'B')
                {
                    bj = j;
                    bi = i;
                }
                else if (row.charAt(i) == 'R')
                {
                    rj = j;
                    ri = i;
                }
                else if (row.charAt(i) == 'L')
                {
                    lj = j;
                    li = i;
                }
            }
        }
        int distance = (Math.abs(lj - bj) + Math.abs(li - bi)) - 1; 
        if ((li == bi && li == ri && lj < rj && rj < bj) || (li == bi && li == ri && lj > rj && rj > bj))
        {
            distance += 2;
        }
        if ((lj == bj && lj == rj && li < ri && ri < bi) || (lj == bj && lj == rj && li > ri && ri > bi))
        {
            distance += 2;
        }
        pw.print(distance);
        pw.close();
    }
}