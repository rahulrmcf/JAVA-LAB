package graphics;
import java.util.Scanner;
public class triangle implements ap
{
	Scanner sc=new Scanner(System.in);
	int b,h;
	public void read()
	{
	System.out.println("Enter the height & breadth of the triangle: ");
	h=sc.nextInt();
	b=sc.nextInt();
	}
	public void area()
	{
		float ar=b*h/2;
		System.out.println("Area of triangle: "+ar);
	}
}