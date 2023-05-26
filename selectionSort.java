import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] a={4,2,6,4,8,55,82,5,9,7,0,12};
        SelectionSort(a);
        cycleSort();
        System.out.println( Arrays.toString(a));
    }

    // Selection sort
    public static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length-1 ; i++){
            for(int j=i+1;j<arr.length ;j++){
                if(arr[i]>arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }





    //Cycle sort
    public static void cycleSort(){
        int[] arr={7,6,5,6,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i=0;
        while(i< arr.length){
            int correct = arr[i] - 1;
            if(arr[i]!= arr[correct]){
                swap(arr,i,correct);
                
            }
            else
                i++;
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
