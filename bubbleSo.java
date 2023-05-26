import java.util.Arrays;

public class bubbleSo {
    public static void main(String[] args) {
        int[] arr={2,54,6,5,878,2,4,0,74,2};
        int n=arr.length;
        System.out.println(Arrays.toString(arr));
        System.out.println();
        // for(int i=0;i<n-1;i++){
        //     for(in
            // j=0;j<n-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(arr));
        bubbSort(arr,n);
        System.out.println(Arrays.toString(arr));
        
    }

    static void bubbSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
