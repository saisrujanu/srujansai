package prgs4;
import java.util.*;
public class neon_number {
	public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter Number:");
    int n=sc.nextInt();
    int sq=n*n;
    int sum=0;
    while (sq>0)
    {
    	int rem=sq%20;
    	sum=sum+rem;
    	sq=sq/10;
    }
if (sum==n)
	System.out.println("Neon Number");
else 
	System.out.println(" Not Neon Number");
	}

}

