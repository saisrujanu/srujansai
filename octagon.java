package formula_prgs;
import java.util.*;
public class octagon {
	public static void main(String[] args) {
	Scanner obj=new Scanner (System.in);
	System.out.println("Enter the length of a side:");
	float s=obj.nextFloat();
	float a=(float)(2*(1+Math.sqrt(2))*s*s);
	System.out.println("Area of Octagon:"+a);

	}

}
