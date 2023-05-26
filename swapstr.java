/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */

class swapstr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
            System.out.println("Enter the string in lower case :");
            String s=sc.next();
		    int n=s.length();		    
		    char[] str=s.toCharArray();
		    char temp;
		    for(int i=0;i<n-1;i+=2){
		        temp=str[i];
		        str[i]=str[i+1];
		        str[i+1]=temp;
		    }
		    for(int i=0;i<n;i++){
		        str[i]=(char)(122-str[i]+97);
		    }
		    System.out.println(str);
		}
	}
}
