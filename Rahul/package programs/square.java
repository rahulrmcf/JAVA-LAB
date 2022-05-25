package graphics;
import java.util.Scanner;
public class square implements ap
{
	Scanner sc=new Scanner(System.in);
	int ra;
	public void read()
	{
	System.out.println("Enter the side of the square: ");
	ra=sc.nextInt();
	}
	public void area()
	{
		int ar=ra*ra;
		System.out.println("Area of square: "+ar);
	}
}