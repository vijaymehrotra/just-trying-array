import java.util.Arrays;

public class PassingInFunctrion{
    public static void main(String[] args) {
        int[] nums={3,4,5,34};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[2]=63;
    }
}