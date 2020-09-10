package prgs3;
import java.util.*;
public class palindrome_N {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter size:");
		int s=sc.nextInt();
		System.out.println("Enter "+s+" numbers:");
		int n[]=new int[s];
		for ( int i=0;i<s;i++)
		{
			n[i]=sc.nextInt();
		}
    for (int i=0;i<s;i++)
    {
    	int rev=0;
    	int temp=n[i];
    	while (n[i]>0)
    	{
    		int rem=n[i]%10;
    		rev=(rev*10)+rem;
    		n[i]=n[i]/10;
    	}
    if (temp==rev)
    	System.out.println(temp+"is a palindrome number");
    else 
    	System.out.println(temp+"is not a palindrome number ");
    }
	}

}
