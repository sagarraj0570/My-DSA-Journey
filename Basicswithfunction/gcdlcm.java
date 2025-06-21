import java.util.*;
class gcdlcm{
    public static void main (String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            int n1,n2;
            n1=sc.nextInt();
            n2=sc.nextInt();
            int gcd=0;
            for(int i=1;i<=n2;i++)
            {
                if(n1%i==0 && n2%i==0)
                {
                    gcd=i;
                }

            }
            int lcm = (n1*n2)/gcd;

            System.out.println(gcd);
            System.out.println(lcm);

        }
    }

}
