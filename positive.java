package formula_prgs2;
import java.util.*;
public class positive {
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter size:");
	int n=sc.nextInt();
	int a[]=newInt[n];
     System.out.println("Enter"+n+"Values:");
    for(int i=0;i<n;i++)
    {
    	a[i]=sc.nextInt();
    }
    for (int j=0;j<n;j++)
    {
    	if (a[i]>=0)
    		System.out.println(a[i]+"is positive");
    	else
    		System.out.println(a[i]+"is negative");
    }
	}

}
