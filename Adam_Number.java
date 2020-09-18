package prg4;
import java.util.*;
public class Adam_Number {
	static int sq(int num)
	{
		return(num*num);
	}
	static int rev(int num)
	{
		int r=0;
		while(num>0)
		{
			int rem=num%10;
			r=r*10+rem;
			num=num/10;
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int a=sq(num);
		int b=sq(rev(num));
		if (a==rev(b))
			System.out.println("Adam Number");
		else
			System.out.println("Not Adam Number");

	}

}
