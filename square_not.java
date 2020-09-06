package formula_prgs2;
import java.util.*;
public class square_not {
	public static void main(String[] args) {
	Scanner obj=new Scanner (System.in);
	int x=obj.nextInt();
	double sr=Math.sqrt(x);
	if ((sr-Math.floor(sr))==0)
	{
	System.out.println("Square number");
	else
	System.out.println("Not square number");
}
}
}