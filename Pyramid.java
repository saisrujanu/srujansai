package prgs6;
public class Pyramid {
	public static void main(String[] args) {
		int stars=1;
		int n=5;
		int space=n-1;
		for (int i=1;i<=n;i++)
		{
			for (int j=space;j>=1;j--)
			{System.out.print(" ");}
			for (int k=1;k<=stars;k++)
			System.out.print("* ");
			stars=stars+2;
			System.out.println();
		}

	}

}
