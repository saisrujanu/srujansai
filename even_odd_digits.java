package formula_prgs2;
import java.util.*;
public class even_odd_digits {
	public static void main(String[] args) {
		Scanner obj =new Scanner (System.in);
		System.out.println("Enter size:");
        int s= obj.nextInt();
        int []nums=new int[s];
        int even=0,odd=0;
        System.out.println("Enter"+s+"values:");
        for(int i=0;i<s;i++)
        {
        	nums[i]=obj.nextInt();
        }
	for(int i=0;i<s;i++)
	{
		if(nums[i]%2==0)
			even++;
		else
			odd++;
	}
		System.out.println("even number count="+even);
		System.out.println("odd number count="+odd);
	}

}
