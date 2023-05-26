import java.util.Scanner;
public class sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        int sum1=0;
        for(int i=0;i<n;i++){
            if(A[i]<0){
                sum1=sum1+A[i];
                for(i=i;i<n;i++){
                    if(A[i]>=0){
                        sum1=sum1+A[i];
                        break;
                    }
                }
            }
        } 
        int sum2=0;      
        for(int i=0;i<n;i++){
            if(A[i]>=0){
                sum2=sum2+A[i];
                for(i=i;i<n;i++){
                    if(A[i]<0){
                        sum2=sum2+A[i];
                        break;
                    }
                }
            }
        } 

        System.out.println(Math.max(sum1, sum2));
    }
}
