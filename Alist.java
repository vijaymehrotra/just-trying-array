import java.util.ArrayList;
import java.util.Scanner;

public class Alist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        
        int i;
        // for(i=0;i<3;i++){
            list.add(1);
            list.add(2);
            list.add(4);
            list.add(6);
        // }
        
        int[] arr = {2,4};
        System.out.println(list.contains(arr));
        System.out.println(list);
    }
}
