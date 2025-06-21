import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int t= sc.nextInt();

            int count = 0;

            for (int div=2;div*div<=t;div++ ){
                if(t%div==0){
                    count++;
                    break;
                }
            }

            if (count == 0){
                System.out.println("Prime");


            }
            else{
                System.out.println("Not prime");
            }
        }

    }
}
