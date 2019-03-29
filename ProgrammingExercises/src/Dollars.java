import java.util.Scanner;

public class Dollars
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Dollars: ");
        int dollar = input.nextInt();
        int twenty = dollar / 20;
        int ten = dollar / 10;
        int five = dollar / 5;
        System.out.println("Dollars: " + dollar);
        System.out.println("20s: " + twenty);
        System.out.println("10s: " + ten);
        System.out.println("5s: " + five);
        System.out.println("1s: " + dollar);
    }
}
