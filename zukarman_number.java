package prgs4;
import java.util.*;
public class zukarman_number 
{
	static int display(int n)
	{
		int p=1;
		while(n!=0)
		{
			int rem=n%10;
			p=p*rem;
			n=n/10;
		}
	return p;
	}
	public static void main(String[] args) {
		System.out.println("Enter Number:");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		if (n%display (n)==0)
			System.out.println("zukarman Number");
		else
			System.out.println("Not zukarman Number");

	}

}
