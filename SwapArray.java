import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] ar,int ind1,int ind2){
        int temp=ar[ind2];
        ar[ind2]=ar[ind1];
        ar[ind1]=temp;
        // System.out.println(Arrays.toString(arr));
    }
}
