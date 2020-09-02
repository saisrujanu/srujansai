package formula_prgs;
import java.util.*;
public class pentagon {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the length of a side:");
	int s=obj.nextInt();
	System.out.println("enter the apothem length:");
	int a=obj.nextInt();
	float area=(5/2)*s*a;
	System.out.println("Area of the pentagon:"+area);

	}

}
