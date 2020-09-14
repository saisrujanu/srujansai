package prgs3;
import java.util.*;
public class Even_Odd_mixed {
	static void print (int num)
	{
		int n=num;
		int f=1;
		while (num!=0)
		{
			int d=num%10;
			if (n%2==0&&d%2==1)
			{
				f=2;
				break;
			}
			else if(n%2==1 && d%22==0)
			{
				f=2;
				break;
			}
		num=num/10;
		}
	if ( f==1 && n%2==0)
		System.out.println("Full Even number:");
	else if (f==1 && n%2==1)
		System.out.println("Full Odd number: ");
	else 
		System.out.println("Mixed numbers:");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		print(num);

	}

}
