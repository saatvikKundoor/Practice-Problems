import java.io.*;
import java.util.*;

public class stuckInARut {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int N = Integer.parseInt(r.readLine());
        ArrayList<int[]> nCows = new ArrayList<>();
        ArrayList<int[]> eCows = new ArrayList<>();
        for (int i = 0; i < N; i++)
        {
            StringTokenizer s = new StringTokenizer(r.readLine());
            String d = s.nextToken();
            int x = Integer.parseInt(s.nextToken());
            int y = Integer.parseInt(s.nextToken());
            if (d.equals("N"))
            {
                nCows.add(new int[] {x,y,i});
            }
            else {
                eCows.add(new int[] {x,y,i});
            }
        }
        Collections.sort(nCows, Comparator.comparingInt(a -> a[0]));
        Collections.sort(eCows, Comparator.comparingInt(a -> a[1]));
        int[] blocks = new int[N];
        Arrays.fill(blocks, -1);
        for (int[] n : nCows)
        {
            for (int[] e : eCows)
            {
                if (n[0] > e[0] && n[1] < e[1])
                {
                    int eastSteps = n[0] - e[0];
                    int northSteps = e[1] - n[1];
                    if (northSteps > eastSteps && blocks[e[2]] == -1)
                    {
                        blocks[n[2]] = e[1];
                        break;
                    }
                    if (northSteps < eastSteps && blocks[e[2]] == -1)
                    {
                        blocks[e[2]] = n[0];
                        
                    }
                }
            }
        }
        
        int[] distances = new int[N];
        Arrays.fill(distances, -1);
        for (int[] n : nCows)
        {
            if (blocks[n[2]] != -1)
            {
                distances[n[2]] = blocks[n[2]] - n[1];
            }
        }
        for (int[] e : eCows)
        {
            if (blocks[e[2]] != -1)
            {
                distances[e[2]] = blocks[e[2]] - e[0];
            }
        }
        for (int d : distances)
        {
            pw.println((d == -1) ? "Infinity" : d);
        }
        pw.close();
    }
}
