import java.io.*;
import java.util.StringTokenizer;

public class MaximumDistance {
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(r.readLine());
        StringTokenizer s = new StringTokenizer(r.readLine());
        int[] xValues = new int[N];
        for (int i = 0; i<N; i++)
        {
            xValues[i] = Integer.parseInt(s.nextToken());
        }
        int[] yValues = new int[N];
        s = new StringTokenizer(r.readLine());
        for (int i = 0; i<N; i++)
        {
            yValues[i] = Integer.parseInt(s.nextToken());
        }
        int[][] coordinates = new int[N][2];
        for (int i = 0; i< N; i++)
        {
            coordinates[i] = new int[] {xValues[i], yValues[i]};
        }
        double distance = 0;
        for (int i =0; i<coordinates.length; i++)
        {
            for (int[] c : coordinates)
            {
                double yDiff = Math.abs(coordinates[i][1] - c[1]);
                double xDiff = Math.abs(coordinates[i][0] - c[0]);
                distance = Math.max(distance, Math.sqrt(Math.pow(yDiff,2) + Math.pow(xDiff,2)));
            }
        }
        
        pw.println((int)(Math.round(distance*distance)));
        pw.close();
    }
    
}
