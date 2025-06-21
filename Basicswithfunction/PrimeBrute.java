import java.util.*;
public class PrimeBrute {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            int t= sc.nextInt();
            int count = 0;
            for (int div = 1; div<=t;div++){
                if (t%div==0){
                    count++;
                }

            }
            if (count==2){
                System.out.println("Prime");
            }
            else{
                System.out.println(" Not Prime");
            }



        }


    }

}
