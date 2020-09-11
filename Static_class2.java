package pack5;
class Static_class2 
{
	static class Nested_class
	{
		static class Inner_class
		{
			public void Method2()
			{
				System.out.println("Static inner class2");
			}
		}
	}

}
public class Main_class1
{
	public static void main(String [] args)
	{
		static_class.Nested_class().inner_class obj=new static_class.Nested_class().inner_class();
		obj.Method2();
	}
}