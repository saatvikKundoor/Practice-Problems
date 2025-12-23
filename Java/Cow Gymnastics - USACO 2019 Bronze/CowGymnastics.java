import java.io.*;
import java.util.*;

public class CowGymnastics {
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new FileReader("gymnastics.in"));
        PrintWriter pw = new PrintWriter("gymnastics.out");
        StringTokenizer s = new StringTokenizer(r.readLine());
        int k = Integer.parseInt(s.nextToken());
        int n = Integer.parseInt(s.nextToken());
        
        int[][] pairs = new int[k][n];
        for (int i = 0; i<k; i++)
        {
            s = new StringTokenizer(r.readLine());
            int[] ranks = new int[n];
            for (int j = 0; j<n; j++)
            {
                ranks[j] = Integer.parseInt(s.nextToken()) - 1;
            }
            pairs[i] = ranks;
        }
        int answers = 0;
        //compare cow A against cow B in each line of positions - if cow A is greater than cow B in each positions answers++
        for (int i = 0; i<n;i++)
        {
            for (int j = 0; j<n;j++)
            {
                if (i==j){continue;}
                boolean valid = true;
                for (int[] p : pairs)
                {
                    int indexA = 0;
                    int indexB = 0;
                    for (int a =0; a <p.length; a ++)
                    {
                        if (p[a] == i)
                        {
                            indexA = a;
                        }
                    }
                    for (int b =0; b <p.length; b ++)
                    {

                        if (p[b] == j)
                        {
                            indexB = b;
                        }
                    }
                    if (indexA < indexB)
                    {
                        valid = false;
                        break;
                    }
                }
                if (valid)
                {
                    answers++;
                }
            }
        }
        pw.println(answers);
        pw.close();
        
    }
}
