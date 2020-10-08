package Prgs9;
import java.util.*;
public class col4 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		for (int i=1;i<=10;i++)
			a.add(i);
		System.out.println(a);
		Iterator itr=a.iterator();
		while (itr.hasNext())
		{
			Integer i=(Integer)itr.next();
			if(i%2==0)
				System.out.println(a);
			else
				itr.remove();
		}
System.out.println(a);

	}

}
