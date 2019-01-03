import java.util.Scanner;

public class StudentArray
{
    public static void main(String[] args)
    {
        char name;
        int i;
        int markslist[]=new int[6];
    
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the student name:\n");
        name=input.next().charAt(0);
        System.out.println("Enter the marks:\n");
        for(i=0;i<markslist.length;i++)
        {
          markslist[i]= input.nextInt();
        }
        for(i=0;i<markslist.length;i++)
            System.out.println("Obtained Marks in subj"+i+"=\t"+markslist[i]);
    }
   
}