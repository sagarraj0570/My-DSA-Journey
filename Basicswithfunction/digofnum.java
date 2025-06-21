import java.util.*;
class DIG
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        int num=sc.nextInt();
        int k=0,x,c=0;
        k=num;
        while(k!=0)
        {
            x=k%10;
            c=c+1;
            k=k/10;
        }
        for (int i=c-1;i>=0;i--)
        {
            int dig=num/(int)(Math.pow(10,i));
            System.out.println(dig);
            num=num%(int)(Math.pow(10,i));
        }
    }
}