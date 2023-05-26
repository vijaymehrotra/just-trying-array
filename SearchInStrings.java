import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name="Vijay Mehrotra";
        char target='e';
        // System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str , int target){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target)
                return true;
        }

        // for(char ch: str.toCharArray()){
        //     if(ch==target)
        //         return true;
        // }

        return false;
    }
}
