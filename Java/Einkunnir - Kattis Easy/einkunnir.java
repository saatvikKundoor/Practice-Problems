import java.io.*;
import java.util.StringTokenizer;

public class einkunnir
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(r.readLine());
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        String[] answers = r.readLine().split(" ");
        for (int i = 0; i < n; i++)
        {
            String name = r.readLine();
            String[] studentAnswers = r.readLine().split(" ");
            double grade = 0.0;
            for (int k = 0; k < answers.length; k++)
            {
                if (studentAnswers[k].equals(answers[k]))
                {
                    grade ++;
                }
            }
            grade = grade/s;
            grade *= 10;
            grade = Math.round(grade * 2)/2.0;
            
            pw.println(name + ": " + grade);
        }
        pw.close();
    }
}