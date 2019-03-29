import java.util.Scanner;

public class MinutesConversion
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many minutes: ");
        int min = input.nextInt();
        float hrs = (float) (min / 60);
        float days = hrs / 24;
        System.out.println("Minutes: " + min);
        System.out.println("Hours: " + hrs);
        System.out.println("Days: " + days);
    }
}
