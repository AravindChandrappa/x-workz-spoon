import java.util.Scanner;
class EventAllpgms
{
    public static void main(String[] args)
    {
        System.out.println("$$ Event prigrams list $$\n");
        int repeat=1,fact=1,num,num1=20;
        int evenSum=0, oddSum=0, sum=0;
        char choice;
        char input='y';
        int[] sub=new int[6];
        
        while(input=='y')
        {
            System.out.println("Choose below option for pgms\n");
            System.out.println("1. While Switch Program");
            System.out.println("2. Factorial program");
            System.out.println("3. Even and odd pgm");
            System.out.println("4. Array marks pgm\n");

            Scanner in=new Scanner(System.in);
            System.out.println("Enter your choice:");
            int choice1=in.nextInt();

            switch(choice1)
            {
            
                case 1: while(repeat==1)
                        {
                            System.out.println("Enter your choice to choose course:");
                            System.out.println("j---> Java");
                            System.out.println("f---> Framework");
                            System.out.println("w---> Webtech");
                            System.out.println("e---> Jee");
                            System.out.println("p---> Project");
                            Scanner scan=new Scanner(System.in);
                            choice=scan.next().charAt(0);
        
                            switch(choice)
                            {
                                case 'j': System.out.println("you are choosen java\n");
                                    break;
                                case 'f': System.out.println("you are choosen framework\n");
                                    break;
                                case 'w': System.out.println("you are choosen webtech\n");
                                    break;
                                case 'e': System.out.println("you are choosen jee\n");
                                    break;
                                case 'p': System.out.println("you are choosen project\n");
                                    break;
                                default: System.out.println("you choosen wrong choice!!!!\n");
                            }
                                System.out.println("if u want proceed with course option prees 1 otherwise exit to 0");
                                repeat=scan.nextInt();
                        }
                        break;

                case 2: Scanner scan=new Scanner(System.in);
                        System.out.println("Enter the number to fact:");
                        num=scan.nextInt();
                        for(int i=1;i<=num;i++)
                        {
                            fact=fact*i;
                        }
                        System.out.println("Factorisl of"+num+"="+fact+"\n");
                        break;

                case 3: System.out.println("Even and Odd sum is:");
                        for(int i=1;i<=num1;i++)
                        {
                            if(i%2==0)
                            evenSum=evenSum+i;
                        else
                            oddSum=oddSum+i;
                        }
                        System.out.println("Evensum="+evenSum);
                        System.out.println("oddSum="+oddSum+"\n");
                        break;

                case 4: 
                        Scanner scan1=new Scanner(System.in);
                        System.out.println("Enter the marks");
                        for(int i=0;i<sub.length;i++)
                        {
                            sub[i]=scan1.nextInt();
                            sum=sum+sub[i];
        
                        }
                        System.out.println("sum of subjects="+sum+"\n");
                        break;

                default: System.out.println("you have choosen wrong choice");
            }
            System.out.println("If you want to contineu by main option press y oterwise press n to exit");
            input=in.next().charAt(0);
        
        }
       
    }
}