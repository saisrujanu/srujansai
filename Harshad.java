package log_on;
import java.util.*;
public class Harshad {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		int sum=0;
		int c=n;
		while(c>0)
		{
			int rem=c%10;
			sum=sum+rem;
			c=c/10;
		}
if (n%sum==0)
	System.out.println("Harshad Number");
else 
	System.out.println("Not Harshad Number");
	}

}
