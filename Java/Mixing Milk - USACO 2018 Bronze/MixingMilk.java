import java.io.*;
import java.util.StringTokenizer;

public class MixingMilk
{
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new FileReader("mixmilk.in"));
        PrintWriter pw = new PrintWriter("mixmilk.out");

        StringTokenizer s = new StringTokenizer(r.readLine());
        long b1c = Long.parseLong(s.nextToken());
        long b1m = Long.parseLong(s.nextToken());
        s = new StringTokenizer(r.readLine());
        long b2c = Long.parseLong(s.nextToken());
        long b2m = Long.parseLong(s.nextToken());
        s = new StringTokenizer(r.readLine());
        long b3c = Long.parseLong(s.nextToken());
        long b3m = Long.parseLong(s.nextToken());

        int startBucket = 1;
        for (int i =0; i < 100; i++)
        {
            if (startBucket == 1)
            {
                long difference = b2c - b2m;
                
                if (b1m >= difference)
                {
                    b2m += difference;
                    b1m -= difference;
                }
                else {
                    b2m += b1m;
                    b1m = 0;
                }
                startBucket = 2;
                
            }
            else if (startBucket == 2)
            {
                long difference = b3c - b3m;
                if (b2m >= difference)
                {
                    b3m += difference;
                    b2m -= difference;
                }
                else {
                    b3m += b2m;
                    b2m = 0;
                }
                startBucket = 3;
                
            }
            else if (startBucket == 3)
            {
                long difference = b1c - b1m;
                if (b3m >= difference)
                {
                    b1m += difference;
                    b3m -= difference;
                }
                else {
                    b1m += b3m;
                    b3m = 0;
                }
                startBucket = 1;
                
            }
        }
        pw.println(b1m);
        pw.println(b2m);
        pw.println(b3m);
        pw.close();
    }

    
}