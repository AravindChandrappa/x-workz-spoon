import java.util.Scanner;

public class MarksArray
{
    public static void main(String[] args)
    {
        int[] sub=new int[6];
        int sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the marks");
        for(int i=0;i<sub.length;i++)
        {
                sub[i]=scan.nextInt();
                sum=sum+sub[i];

        }
        System.out.println(sum);
    }
}