public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,34,56,78,9,0,456};
        System.out.println(LSearch(arr, 3));
    }
    static boolean LSearch(int[] arr,int target){
        if(arr.length==0)
            return false;
        
        for(int index=0;index<arr.length;index++){
            if(arr[index]==target)
                return true;
        }
        return false;
    } 
}
