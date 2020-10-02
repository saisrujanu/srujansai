package prgs7;
class Thread2 implements Runnable
{
	 public void run()
	 {
		 for (int i=1;i<=10;i++)
		 {
			 System.out.println("Sub Class");
		 }
	 }
}
public class MyThread2 {
	public static void main(String[] args) {
		Thread2 obj=new Thread2();
		Thread obj2=new Thread(obj);
		obj2.start();
		for (int j=1;j<=10;j++)
		{
			System.out.println("Main Class");
		}

	}

}
