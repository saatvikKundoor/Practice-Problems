import java.io.*;

public class Watermelon{
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int a = Integer.parseInt(r.readLine());
        if (a%2 == 0 && a > 2)
        {
            pw.print("YES");
        }
        else {
            pw.print("NO");
        }
        pw.close();
    }
}