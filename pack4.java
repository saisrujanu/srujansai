package finals;
class B

{
	void show ()
	{
		final int x=10;
		x=20;
		System.out.println("x="+x);
	}
}
public class pack4 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
B.obj=new B();
obj.show();
	}

}
