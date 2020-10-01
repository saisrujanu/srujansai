package prgs7;
public class Diamond2 {
	public static void main(String[] args) {
		int stars=1;
		int n=5;
		int space=n-1;
		for (int i=1;i<=n;i++)
		{
			for (int j=space;j>=i;j--)
				System.out.print(" ");
			for (int k=1;k<=stars;k++)
				System.out.print("*");
			stars=stars+2;
			System.out.println();
		}
		n=4;
		stars=stars-4;
		space=n;
		for (int i=n;i>=1;i--)
		{
			for (int j=space;j>=i;j--)
				System.out.print(" ");
			for (int k=1;k<=stars;k++)
				System.out.print("*");
			stars=stars-2;
			System.out.println();
		}

	}

}
