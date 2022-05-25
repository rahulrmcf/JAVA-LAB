//import graphics.ap;
import graphics.rectangle;
import graphics.triangle;
import graphics.circle;
import graphics.square;
import java.util.Scanner;
public class pack{
	public static void main(String args[])
	{
		circle c=new circle();
		rectangle r=new rectangle();
		square s=new square();
		triangle t=new triangle();
		Scanner sc=new Scanner(System.in);
		int op;
		do
		{
			System.out.println("\nEnter your choice: \n\n1.Rectangle\n2.Circle\n3.Square\n4.Triangle\n5.Exit\n");
			op=sc.nextInt();
			switch(op)
			{
			case 1:r.read();
					r.area();
					break;
			case 2:	c.read();
					c.area();
					break;
			case 3:	s.read();
					s.area();
					break;
			case 4:	t.read();
					t.area();
					break;
			case 5:break;
			
			default: System.out.println("INVALID INPUT");

				}

		}while(op!=5);
	}
}