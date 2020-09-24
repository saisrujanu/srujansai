package prgs5;
import java.util.*;
public class Digital_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);// TODO Auto-generated method stub
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        int sum=0;
        while (n>0 || sum>9)
        {
        	if (n==0)
        	{
        		n=sum;
        		sum=0;
        	}
        int rem=n%10;
        sum=sum+rem;
        n=n/10;
        }
	System.out.println(sum);
	}

}
