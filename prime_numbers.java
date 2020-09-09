package prgs3;
import java.util.*;
public class prime_numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number:");
		int n1=sc.nextInt();
		for (int i=1;i<n1;i++)
		{
			int c=0;
			for (int n=1;n>=1;n--)
			{
				if(i%n==0)
				{
					c+=1;
				}
			}
		if (c==2)
			System.out.print(i+"");
		}

	}

}
