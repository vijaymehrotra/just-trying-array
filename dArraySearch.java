import java.util.Arrays;

public class dArraySearch {
    public static void main(String[] args) {
        int[][] arr={
            {2,41,6,87,45,33,49,0},
            {5,64,7},
            {8,9,10,56,34,2}
        };
        int[] ans=scarch(arr,49);
        System.out.println(max(arr));
        System.out.println(Arrays.toString(ans));
    }
    static int[] scarch(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target)
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max)
                    max=arr[row][col];
            }
        }
        return max;
    }
}
