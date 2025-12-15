import java.io.*;

public class lvable
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        r.readLine();
        String word = r.readLine();
        if (word.indexOf("lv") >=0 )
        {
            pw.print(0);
        }
        else if(word.indexOf("l") >- 0|| word.indexOf("v")>= 0)
        {
            pw.print(1);
        }
        else 
        {
            pw.print(2);
        }
        pw.close();

    }
}