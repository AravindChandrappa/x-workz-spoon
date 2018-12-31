import java.util.Scanner;
public class Fact
{
    public static void main(String[] args)
    {
        int fact=1;
        int num;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to fact:");
        num=scan.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorisl of"+num+"="+fact);
    }
}