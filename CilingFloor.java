public class CilingFloor {
    public static void main(String[] args) {
        int[] arr={2,3,5,8,16,18,20};
        System.out.println(cieling(arr,14));
        System.out.println(floor(arr,14));
    }

    static int cieling(int[] arr,int target){
        if(target > arr[arr.length-1]){
            return -1;
        }
        int low=0,hi=arr.length-1;
        while(low <= hi){
            int mid=(low+hi)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] > target){
                hi=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return arr[low];
    }
    static int floor(int[] arr,int target){
        if(target < arr[0]){
            return -1;
        }
        int low=0,hi=arr.length-1;
        while(low <= hi){
            int mid=(low+hi)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] > target){
                hi=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return arr[hi];
    }
}
