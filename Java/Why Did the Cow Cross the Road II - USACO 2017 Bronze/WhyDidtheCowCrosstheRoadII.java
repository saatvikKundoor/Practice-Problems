import java.io.*;
import java.util.*;

public class WhyDidtheCowCrosstheRoadII {
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new FileReader("circlecross.in"));
        PrintWriter pw = new PrintWriter("circlecross.out");
        String seq = r.readLine();
        int answers = 0;
        char[] arr = seq.toCharArray();
        int[] first = new int[26];
        int[] second = new int[26];
        Arrays.fill(first, -1);
        for (int i =0; i < 52; i++) //each letter in arr
        {
            //arrays will start at 0 (considered A). 
            int index = arr[i] - 'A'; //index letter based on where it falls from a-z.
            if (first[index] == -1) // check if this is the first occurrence of that letter
            {
                first[index] = i; //save the index of the first occurrence of the letter
            }
            else {
                second[index] = i; //save the index of the second occurrence of the letter
            }
        }
        for (int i =0; i < 26; i++) //iterate through each first letter
        {
            int a1 = first[i]; //first occurrence of the letter
            int a2 = second[i]; //second occurrence of the letter
            for (int j = i+1; j < 26; j++)
            {
                int b1 = first[j];//first occurrence of the next letter
                int b2 = second[j]; //second occurrence of the next letter
                if ((a1<b1 && b1<a2 && b2>a2) || (b1<a1 && a1<b2 && b2<a2))
                {
                    answers++;
                }
            }
        }
        pw.println(answers);
        pw.close();
    }
    
}
