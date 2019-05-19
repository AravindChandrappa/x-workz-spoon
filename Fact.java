import java.util.Scanner;
public class Fact
{
    public static void main(String[] args)
    {
        System.out.println("main method started") 
        int fact=1;
        int num;
//fdsbnsauydbjsdgiy saudbbkjh 
        Scanner scan=new Scanner(System.in);
        //djh sud dsdusb sd
        System.out.println("Enter the number to fact:");
        num=scan.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorisl of"+num+"="+fact);
    }
}
