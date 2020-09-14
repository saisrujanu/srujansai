package prgs3;
import java.util.*;
public class Smallest_Largest_Digits {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		snum=lnum;
		snum=1num=num%10;
		while (num>0)
		{
			int rem =num%10;
			if (rem>1num)
			{1num=rem;}
			else if (rem<=snum)
			{snum=rem;}
		num=num/10;
		}
System.out.println("Smallest digits="+Snum);
System.out.println("Largest digits="+lnum);
	}

}
