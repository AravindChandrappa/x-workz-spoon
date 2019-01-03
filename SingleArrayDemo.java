import java.util.*;
public class SingleArrayDemo
{
    public static void main(String[] args)
    {
        /*int[] arr;
        arr=new int[5];*/

        int arr[]=new int[5];
        System.out.println("Elements of an Array\n");

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        for(int i=0;i<arr.length;i++)
        System.out.println("Array elements are:"+arr[i]);
    }
}