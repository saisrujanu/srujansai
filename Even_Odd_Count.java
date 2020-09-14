package formula_prgs2;
import java.util.*;
public class Even_Odd_Count {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
        System.out.println("Enter size:");
        int s=sc.nextInt();
        int even=0,odd=0;
        int [] num=new int [s];
        System.out.println("Enter "+s+"values:");
        for (int i=0;i<s;i++)
        {
        	num [i]=sc.nextInt();
        }
	for (int i=0;i<s;i++)
	{
		if (num[i]%2==0)
			even ++;
		else 
			odd++;
	}
	System.out.println("even number count ="+even);
	System.out.println("Odd number count ="+odd);
	}

}
