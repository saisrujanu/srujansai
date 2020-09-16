package prg1;
import java.util.*;
public class SPY {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		int num=n;
		int sum=0,mul=1;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			mul=mul*rem;
			num=num/10;
		}
if (sum==mul)
	System.out.println(n+"is aSPY Number");
else
	System.out.println(n+"is not SPY Number");
	}

}
