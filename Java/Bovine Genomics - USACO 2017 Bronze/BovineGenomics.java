import java.io.*;
import java.util.*;

public class BovineGenomics {
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new FileReader("cownomics.in"));
        PrintWriter pw = new PrintWriter("cownomics.out");
        StringTokenizer s = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(s.nextToken());
        int m = Integer.parseInt(s.nextToken());
        String[][] spottyCows = new String[m][n];
        String[][] plainCows = new String[m][n];
        String[][] lines = new String[n][m];
        for (int i = 0; i<n; i++)
        {
            String[] line = new String[m];
            String lin = r.readLine();
            for (int j = 0; j <m; j++)
            {
                line[j] = lin.substring(j,j+1);
            }
            lines[i] = line;
        }
        for (int i = 0; i<m; i++)
        {
            String[] seq = new String[n];
            for (int j =0; j<lines.length; j++)
            {
                seq[j] = lines[j][i];
            }
            spottyCows[i] = seq;
        }

        for (int i = 0; i<n; i++)
        {
            String[] line = new String[m];
            String lin = r.readLine();
            for (int j = 0; j <m; j++)
            {
                line[j] = lin.substring(j,j+1);
            }
            lines[i] = line;
        }
        for (int i = 0; i<m; i++)
        {
            String[] seq = new String[n];
            for (int j =0; j<lines.length; j++)
            {
                seq[j] = lines[j][i];
            }
            plainCows[i] = seq;
        }
        int answers = 0;
        for (int i = 0; i <plainCows.length; i++)
        {
            boolean valid = true;
            for (String c : plainCows[i])
            {
                for (String b : spottyCows[i])
                {
                    if (c.equals(b))
                    {
                        valid = false;
                    }
                }
            }
            if (valid)
            {
                answers++;
            }
        }
        pw.println(answers);
        pw.close();
    }
}
