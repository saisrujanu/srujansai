package prgs2;
import java.util.*;
public class sum_fib {
	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter numbers:");
		int n=obj.nextInt();
		int t1=0,t2=1,t3=2,sum=t1+t2;
		for (int i=2;i<n;i++)
		{
			t3=t1+t2;
			sum=sum+t3;
			t1=t2;
			t2=sum;
		}
System.out.println("Sum of fib="+sum);
	}

}
