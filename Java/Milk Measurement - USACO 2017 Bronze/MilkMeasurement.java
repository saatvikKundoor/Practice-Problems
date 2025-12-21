import java.io.*;
import java.util.*;
public class MilkMeasurement {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("measurement.in"));
        PrintWriter pw = new PrintWriter("measurement.out");
        int N = Integer.parseInt(r.readLine());
        String[][] log = new String[N][3];
        for (int i =0; i < N; i++)
        {
            StringTokenizer s = new StringTokenizer(r.readLine());
            log[i][0] = s.nextToken();
            log[i][1] = s.nextToken();
            log[i][2] = s.nextToken();
        }
        Arrays.sort(log, Comparator.comparingInt(a -> Integer.parseInt(a[0])));
        int[][] measurements = new int[100][3];
        measurements[0][0] = 7;measurements[0][1] = 7;measurements[0][2] = 7;
        int highest = 7;
        int changeCount = 0;
        int[] index = {1,1,1};
        for (int i =1; i < 100; i++)
        {
            measurements[i][0] = measurements[i-1][0];
            measurements[i][1] = measurements[i-1][1];
            measurements[i][2] = measurements[i-1][2];
            for (String[] a : log)
            {
                if (i == Integer.parseInt(a[0]))
                {
                    if (a[1].equals("Bessie"))
                    {
                        measurements[i][0] = measurements[i-1][0] + Integer.parseInt(a[2]);
                    }
                    if (a[1].equals("Elsie"))
                    {
                        measurements[i][1] = measurements[i-1][1] + Integer.parseInt(a[2]);
                    }
                    if (a[1].equals("Mildred"))
                    {
                        measurements[i][2] = measurements[i-1][2] + Integer.parseInt(a[2]);
                    }
                }
            }
            int[] temp = {0,0,0};
            highest = Math.max(measurements[i][0],Math.max(measurements[i][1],measurements[i][2]));
            for (int k = 0; k < 3; k++)
            {
                if (measurements[i][k] >= highest)
                {
                    temp[k] = 1;
                }
            }
            if (!Arrays.equals(index, temp))
            {
                changeCount++;
                index[0] = temp[0];index[1] = temp[1];index[2] = temp[2];
            }
            
        }
        pw.print(changeCount);
        pw.close();
    }
}