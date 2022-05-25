package arithmetic;
import java.util.Scanner;
public class subtraction implements ar
{
	Scanner sc=new Scanner(System.in);
	int a,b;
	public void read()
	{
	System.out.println("Enter the 1st & 2nd number: ");
	a=sc.nextInt();
	b=sc.nextInt();
	}
	public void result()
	{
		int res=a-b;
		System.out.println("Difference: "+res);
	}
}