package pack5;
public class outer_class2
{
	void myMethod()
	{
		class method inner_class
		{
			int nums=20;
			public void print()
			{
				System.out.println("Method local inner class="+nums);
			}
		}
	method inner-class obj=new method inner-class();
	obj.print();
	}
	public static void main(String[] args) 
	{
		outer_class2 obj=new outer_class2();
		obj.myMethod();

	}

}
