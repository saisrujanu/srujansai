package prgs2;
import java.util.*;
public class Range_Fib {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int sum=sc.nextInt();
		int t1=0,t2=1;
		System.out.println("Fib range upto:"+n+":");
		for(int i=2;i<=n;i++)
		{
			sum=t1+t2;
			t1=t2;
			t2=sum;
		System.out.print(" "+sum);
		}

	}

}
