package ArraysFile;

import java.util.*;
public class ArraySpan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();


        }

        int max = arr[0];
        int min= arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }


        }
        int span = max - min;
        System.out.println(span);



//        int min = Arrays.stream(arr).min().getAsInt();
//        int max = Arrays.stream(arr).max().getAsInt();
//
//        System.out.println("Minimum number of array is : " + min);
//        System.out.println("Maximum number of array is : " + max);
    }

}
