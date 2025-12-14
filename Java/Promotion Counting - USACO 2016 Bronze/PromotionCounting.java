import java.io.*;
import java.util.StringTokenizer;

public class PromotionCounting
{
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new FileReader("promote.in"));
        PrintWriter pw = new PrintWriter("promote.out");
        StringTokenizer s = new StringTokenizer(r.readLine());
        s = new StringTokenizer(r.readLine());
        int sb = Integer.parseInt(s.nextToken());
        int sa = Integer.parseInt(s.nextToken());
        s = new StringTokenizer(r.readLine());
        int gb = Integer.parseInt(s.nextToken());
        int ga = Integer.parseInt(s.nextToken());
        s = new StringTokenizer(r.readLine());
        int pb = Integer.parseInt(s.nextToken());
        int pa = Integer.parseInt(s.nextToken());

        pw.println(sa-sb + ga-gb + pa-pb);
        pw.println(ga-gb + pa-pb);
        pw.println(pa-pb);
        pw.close();

        
    }

}