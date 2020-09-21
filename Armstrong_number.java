package prgs4;
import java.util.*;
public class Armstrong_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		int d=0,sum=0,temp=n;
		while (n>0)
		{
			int rem=n%10;
			d++;
			n=n/10;
		}
n=n/10;
while(n>0)
{
	int rem=n%10;
	sum=sum+(int)Math.pow(rem, d);
	n=n/10;
}
	if (temp==sum)
		System.out.println("Armstrong Number");
	else
		System.out.println(" Not Armstrong Number");
	}

}
