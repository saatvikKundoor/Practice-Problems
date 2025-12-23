import java.io.*;
import java.util.StringTokenizer;

public class MilkPails {
   
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new FileReader("pails.in"));
        PrintWriter pw = new PrintWriter("pails.out");
        StringTokenizer s = new StringTokenizer(r.readLine());
        int x = Integer.parseInt(s.nextToken());
        int y = Integer.parseInt(s.nextToken());
        int m = Integer.parseInt(s.nextToken());
        int numFills = m/y;
        int maxFill = y*numFills;

        for (int i =numFills; i>=0; i--)
        {
            int temp = y*i;
            while (temp + x <= m)
            {
                temp += x;
            }
            maxFill = Math.max(maxFill, temp);

        }
        pw.println(maxFill);
        pw.close();
    }

}
