package formula_prgs;
import java.util.*;
public class si {
	public static void main(String[] args) {
	Scanner obj=new Scanner (System.in);
	System.out.println("enter p,r,n:");
	int p=obj.nextInt();
	int r=obj.nextInt();
	int n=obj.nextInt();
	int si=(p*r*n)/100;
	System.out.println("simple interest="+ si);

	}

}
