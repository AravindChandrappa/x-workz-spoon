import java.util.Scanner;
public class WhileChoice
{
    public static void main(String[] args)
    {
        int repeat=1;
        char choice;

        while(repeat==1)
        {
            System.out.println("Enter your choice:");
            Scanner scan=new Scanner(System.in);
            choice=scan.next().charAt(0);
        
            switch(choice)
            {
                case 'j': System.out.println("you are choosen java");
                            break;
                case 'f': System.out.println("you are choosen framework");
                break;
                case 'w': System.out.println("you are choosen webtech");
                break;
                case 'e': System.out.println("you are choosen jee");
                 break;
                  case 'p': System.out.println("you are choosen project");
                    break;
                 default:
                 System.out.println("you choosen wrong choice");
            }
            System.out.println("you are not chossen in appropriate option if u want proceed prees 1 otherwise exit to 0");
            repeat=scan.nextInt();
        }
    }
}