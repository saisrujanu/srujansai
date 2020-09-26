package prgs6;
import java.util.*;
public class Finger_Count {
static int count(int n)
{
	int r=n%8;
	if (r==1)
		return 1;
	if (r==5)
		return 5;
	if (r==0 || r==2)
		return 3;
	if (r==4 || r==6)
		return 4;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		System.out.println(count(n));

	}

}
