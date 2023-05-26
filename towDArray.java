import java.util.Arrays;
import java.util.Scanner;

public class towDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr = new int [3][3];
        System.out.println(arr.length);
        int row,col;
        for(row=0;row<arr.length;row++){
            for(col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }
        for( row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
                System.out.println();
                
            }
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
        System.out.println("Hello");
    }
}
