package formula_prgs2;
import java.util.*;
public class hemisphere {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		float r=sc.nextFloat();
		float v=(3.14f*(r*r*r)*2/3);
		System.out.println("Volume of Hemisphere="+v);
	

	}

}
