import java.util.*;
public class rotnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int k=num;
        int c=0,x,y,newnum=0;
        while(k!=0)
        {
            x=k%10;
            c=c+1;
            k=k/10;
        }
        System.out.println("for ROTATING type +/- num");
        int n=sc.nextInt();
        if(n>0)
        {

            y=num%(int)Math.pow(10,n);
            newnum=(y*((int)Math.pow(10,c-n)))+(num/(int)Math.pow(10,n));
        }
        else{
            n=Math.abs(n);
            y=num/(int)Math.pow(10,c-n);
            newnum=(num%(int)Math.pow(10,c-n))*(int)Math.pow(10,n)+y;

        }
        System.out.println("Rotated number: " +newnum);
    }
}
