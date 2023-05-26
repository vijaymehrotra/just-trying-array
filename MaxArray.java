public class MaxArray {
    public static void main(String[] args) {
        int[] arr={23,4,5,5,6,7,8,9,0};
        
        System.out.println(max(arr,1,6));
    }
    static int max(int[] arr,int a,int b){
        int m=arr[a];
        for(int i=a;i<=b;i++){
            if(arr[i]>m){
                m=arr[i];
            }

        }
        return m;
    }
}
