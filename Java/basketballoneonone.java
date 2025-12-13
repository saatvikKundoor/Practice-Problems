import java.util.Scanner;

public class basketballoneonone
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String winner = input.nextLine();
        System.out.println(winner.substring(winner.length() - 2, winner.length()-1));
    }
}
    