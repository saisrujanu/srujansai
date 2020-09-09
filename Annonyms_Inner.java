package pack5;
abstract class Inner_class3
{
public static void main(String[]args)
{
	annonymous Inner=new annonymousInner()
			{
		public void myMethod()
		{
			System.out.println("Annonymous Inner class");
		}
			};
			Inner.myMethod();
}
}

