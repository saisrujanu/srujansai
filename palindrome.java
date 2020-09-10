package prgs3;
import java.util.*;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int num=n;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
if (n==rev)
	System.out.println(n+"is a palindrome number");
else 
	System.out.println(n+"is not a palindrome number");
	}

}
