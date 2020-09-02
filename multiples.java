package formula_prgs;
import java.util.*;
public class multiples {
	public static void main(String[] args) {
    Scanner obj =new Scanner (System.in);
    System.out.println("enter 2 numbers=");
    int n=obj.nextInt();
    int s=obj.nextInt();
    System.out.println("multiplies of 3 and 5 are:");
    for(int i=s;i<=n;i++)
    {
    	if (i%3==0&&i%5==0);
    		System.out.print(i+" ");
    }

	}

}
