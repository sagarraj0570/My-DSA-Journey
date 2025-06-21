import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,r=0;
        System.out.println("Enter a number");
        num=sc.nextInt();
        int k=num;
        while(k!=0)
        {
            int x=k%10;
            r=r*10+x;
            k=k/10;
        }
        System.out.println("Reverse:" +r);
    }
}
