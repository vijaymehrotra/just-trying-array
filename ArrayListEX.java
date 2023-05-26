import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListEX {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(2);
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};

        ArrayList<Integer> array_list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            array_list.add(arr[i]);
        }
        array_list.remove(3);
        System.out.println(array_list);

        String[] geeks = {"Rahul", "Utkarsh", "Shubham", "Neelam"};
 
        List<String> al =new ArrayList<String>(Arrays.asList(geeks));
        System.out.println(al);

         System.out.println(array_list.isEmpty());

        
        // list.add(3325);
        // list.add(45);
        // list.add(43);
        // list.add(3443);
        // list.add(3435);
        // list.add(4523);
        // list.add(42323);
        // list.add(0056);
        // list.add(3325);
        // System.out.println(list.contains(45));

        // System.out.println(list);
        // list.set(2, 999);
        // System.out.println(list);

        // for(int i=0;i<5;i++){
        //     list.add(sc.nextInt());
        // }
        // for(int i=0;i<5;i++){
        //     System.out.print(list.get(i));
        // }
        // System.out.println(list);
    }
}
