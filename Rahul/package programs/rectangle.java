package graphics;
import java.util.Scanner;
public class rectangle implements ap
{
	int l,b;
	Scanner sc=new Scanner(System.in);
	public void read()
	{
	System.out.println("Enter length & breadth of the rectangle: ");
	 l=sc.nextInt();
	 b=sc.nextInt();
	}
public void area()
{
int ar=l*b;
System.out.println("Area of rectangle: "+ar);
}
}