package pack5;
class static_class
{
	static class Nested_class
	{
		public void myMethod()
		{
			System.out.println("static nested class");
		}
	}
}
public class Main_class1
{
	public static void main(String[] args) 
	{
		static_class.Nested_class obj=new static_class.Nested_class();
		obj.myMethod();

	}

}
