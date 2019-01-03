import java.util.*;

public class StringArray
{
    public static void main(String[] args)
    {
        int i,j;
        char temp;
        String storedName;

        System.out.println("String array program\n");

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string:");
        String name=scan.nextLine();
        char[] nameArray=name.toCharArray();
        int len=nameArray.length-1;
        for(i=0; i<=nameArray.length/2;i++)
        {
          temp=nameArray[i];
          nameArray[i]=nameArray[len];
          nameArray[len]=temp;
          len--;
        }
        storedName=new String(nameArray);
        char[] newChar=storedName.toCharArray();
        String newString="";
        for(i=nameArray.length-1;i>=0;i--){
            newString=newString+newChar[i];
        }

        // for(i=0;i<=nameArray.length;i++)
        System.out.println("Reversed Name: "+storedName);
        System.out.println("Again Reverse: "+newString);
   }
}