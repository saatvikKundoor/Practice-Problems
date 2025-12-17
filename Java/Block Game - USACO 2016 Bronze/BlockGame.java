import java.io.*;
import java.util.StringTokenizer;

public class BlockGame
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new FileReader("blocks.in"));
        PrintWriter pw = new PrintWriter("blocks.out");
        StringTokenizer s = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(s.nextToken());
        int[] answers = new int[26];
        for (int i = 0; i < N; i++)
        {
            s = new StringTokenizer(r.readLine());
            String a = s.nextToken();
            String b = s.nextToken();
            
           for (char k = 'a'; k <= 'z'; k++)
           {
                int aCount = 0;
                int bCount = 0;
                for (char c : a.toCharArray())
                {
                    if (c == k)
                    {
                        aCount++;
                    }
                }
                for (char c : b.toCharArray())
                {
                    if (c == k)
                    {
                        bCount++;
                    }
                }
                answers[k-97] += Math.max(aCount, bCount);
           }
        }
        
        for (int x : answers)
        {
            pw.println(x);
        }
        pw.close();
        
    }
    
}