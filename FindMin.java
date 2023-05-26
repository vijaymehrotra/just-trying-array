import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={3,5,67,89,44,-7,987,80,76};
        System.out.println(mins(arr));

    }
    static int mins(int[] arr){
        int m=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<m){
                m=arr[i];

            }

        }
        return m;
    }
}
 