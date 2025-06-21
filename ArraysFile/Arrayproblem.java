package ArraysFile;

public class Arrayproblem {
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0] = 13;
        arr[1] = 23;
        arr[2] = 33;
        arr[3] = 43;
        arr[4] = 53;

        swap(arr, 0 , 3);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }



        }

        public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
        }


}
