package graphics;
import java.util.Scanner;
public class circle implements ap
{
	Scanner sc=new Scanner(System.in);
	float r;
	public void read()
	{
	System.out.println("Enter the radius of the circle: ");
	r=sc.nextFloat();
	}
	public void area()
	{
		float ar=(float)3.14*r*r;
		System.out.println("Area of circle: "+ar);
	}
}