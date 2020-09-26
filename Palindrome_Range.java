package prgs6;
import java.util.*;
public class Palindrome_Range {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
       System.out.println("Enter 2 Number:");
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       for (int i=n1;i<=n2;i++)
    	   if (ispalindrome(i)==1)
    		   System.out.print(i+"");
	}
static int ispalindrome (int i)
{
	int n=i;
	int rev=0;
	while (n>0)
	{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
if (i==rev)
	return 1;
else 
	return 0;
}
}
