package finals;
class A
{
	final void show()
	{
		System.out.println("Final method");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("Overriding");
	}
}
public class FinalEx
{
	public static void main(String[] args) {
	B obj=new B();
	obj.show();

	}

}
