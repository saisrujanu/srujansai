package defaultnumbers;
import java.util.*;
public class student_details {
	public static void main(String[] args) {
	Scanner obj =new Scanner(System.in);
	System.out.println("enter sno=");
	int sno=obj.nextInt();
	System.out.println("enter s.name=");
	String sname=obj.next();
	System.out.println("enter age");
	byte age=obj.nextByte();
	System.out.println("enter fee=");
	float fee=obj.nextFloat();
	System.out.println("student details are:");
	System.out.println("sno="+sno+"\nsanme="+sname+"\nage"+age+"\nfee="+fee);

	}

}
