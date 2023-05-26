import java.util.Arrays;

public class RevArray {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[] arr){
        for(int i=0,j=arr.length-1;i<j;j--,i++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
