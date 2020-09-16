package prg1;
import java.util.*;
public class Unique {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int c,flag=1;
		int no=n;
		for (int i=0;i<=9;i++)
		{
			n=no;
			c=0;
			while (n>0)
			{
				int d=n%10;
				if (d==i)
					c++;
				n=n/10;
			}
		if (c>1)
		{
			flag=0;
			break;
		}
		}
if (flag==1)
	System.out.println("Unique Number");
else 
	System.out.println("Not a Unique Number");
	}

}
