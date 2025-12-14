import java.io.*;
import java.util.*;


public class DoYouKnowYourABC
{
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer s = new StringTokenizer(r.readLine());
        int[] array = new int[7];
        for (int i = 0; i < 7; i++){ array[i] = Integer.parseInt(s.nextToken());}
        Arrays.sort(array);

        int c = array[6] - (array[0] + array[1]);
        pw.print(array[0] + " " + array[1] + " " + c);
        pw.close();
    }
}