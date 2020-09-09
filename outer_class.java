package pack5;
public class outer_class 
{
	int num=10;
	private class Inner_class
	{
		int 
		num =10;
		private class inner_class
		{
			int x=20;
			public void point()
			{
				System.out.println("Inside inner class :"+num+""+x);
			}
		}
	void display_Inner()
	{
		inner_class obj=new inner_class();
		obj.print();
		System.out.println("Inner class value from outer class:"+obj.x);
	}
	}
	public class inner_class
	{
	public static void (String[] args)
	{
	outer_class obj=new outer_class();
	obj.display_inner();
}
}
}