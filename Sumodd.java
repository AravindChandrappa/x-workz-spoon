public class Sumodd
{
    public static void main(String[] args)
    {
        int num=20;
        int evenSum=0;
        int oddSum=0;

        for(int i=1;i<=num;i++)
        {
            if(i%2==0)
            {
                evenSum=evenSum+i;
            }
            else
            {
               oddSum=oddSum+i;
            }
        }
        System.out.println("Evensum="+evenSum);
        System.out.println("oddSum="+oddSum);
    }
    
}