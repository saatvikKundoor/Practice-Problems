import java.io.*;
import java.util.StringTokenizer; 

public class Teleportation
{
    public static void main(String[] args) throws IOException{
        try{
            BufferedReader r = new BufferedReader(new FileReader("teleport.in"));
            PrintWriter pw = new PrintWriter("teleport.out");

            StringTokenizer s = new StringTokenizer(r.readLine());
            int a = Integer.parseInt(s.nextToken());
            int b = Integer.parseInt(s.nextToken());
            int x = Integer.parseInt(s.nextToken());
            int y = Integer.parseInt(s.nextToken());

            if (Math.abs((b-a)) > Math.abs((x -a)) + Math.abs((y-b)))
            {
                pw.print(Math.abs((x -a)) + Math.abs((y-b)));
            }
            else if (Math.abs((b-a)) > Math.abs((y -a)) + Math.abs((x-b)))
            {
                pw.print(Math.abs((y -a)) + Math.abs((x-b)));
            }
            else {
                pw.print(Math.abs(b-a));
            }
            pw.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not Found");
        }
    }
}

