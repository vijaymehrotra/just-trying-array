public class binaryArray {
    public static void main(String[] args) {
        int[] arr1={1,3,4,5,6,7,7,7,12,34,56,78,99};
        int ans=binarySearch(arr1,7,0,arr1.length-1);
        System.out.println(ans);

        int arr[]={5,10,3,2,0};
        System.out.println(binaryMountain(arr));
    }
    static int binaryS(int[] nums,int target){
        int start=0;
        int end=nums.length -1;
        while(start <= end){
            // int mid=(start+end)/2;
            int mid=start+ (end-start)/2;
            
            if(target<nums[mid])
                end=mid-1;
            else if(target > nums[mid])
                start=mid+1;
            else
                return mid;
        }
        return -1;
    }
    static int binarySearch(int[] nums,int target,int start,int end){
        while(start <= end){
            // int mid=(start+end)/2;
            int mid=start+ (end-start)/2;
            
            if(target<nums[mid])
                end=mid-1;
            else if(target > nums[mid])
                start=mid+1;
            else
                return mid;
        }
        return -1;
    }
    static int binaryMountain(int[] nums){
        int start=0;
        int end=nums.length -1;
        while(start < end){
            int mid=start+ (end-start)/2;
            if(nums[mid] > nums[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }

        }
        return start;
    }

    // // https://leetcode.com/problems/find-in-mountain-array/description/
    // public int findInMountainArray(int target, MountainArray mountainArr) {
    //     int start=0;
    //     int end=mountainArr.length() -1;
    //     while(start < end){
    //         int mid=start+ (end-start)/2;

    //         if(mountainArr.get(mid) > mountainArr.get(mid+1)){
    //             end=mid;
    //         }
    //         else{
    //             start=mid+1;
    //         }
    //     }
    //     // System.out.println(end);
    //     int p1=binarySearch1(mountainArr , target ,0, end);
    //     int p2=binarySearch2(mountainArr , target,start , mountainArr.length()-1);

    //     return (p1==-1)?p2:p1;
    // }

    // static int binarySearch1(MountainArray mountainArr,int target,int start,int end){
    //     while(start <= end){
    //         int mid=start+ (end-start)/2;
            
    //         if(target<mountainArr.get(mid))
    //             end=mid-1;
    //         else if(target > mountainArr.get(mid))
    //             start=mid+1;
    //         else
    //             return mid;
    //     }
    //     return -1;
    // }
    // static int binarySearch2(MountainArray mountainArr,int target,int start,int end){
    //     while(start <= end){
    //         int mid=start+ (end-start)/2;
            
    //         if(target<mountainArr.get(mid))
    //             start=mid+1;
    //         else if(target > mountainArr.get(mid))
    //             end=mid-1;
    //         else
    //             return mid;
    //     }
    //     return -1;
    // }
}
