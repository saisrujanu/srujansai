package finals;
abstract class Transport 
{
	void color()
	{
		System.out.println("red");
	}
	abstract int wheels();
}
class car extends transport 
{
	int wheels();
	{
		return 4;
	}
} 
class  byke extends transport 
{
	int wheels ()
	{
		return 2;
	}
}
public class abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car obj=new car();
obj.color();
System.out.println("car has="+obj.wheels()+"wheels");
byke obj2=new byke();
System.out.println("byke has "+obj2.wheels()+"wheels");
obj2.color();
	}

}
