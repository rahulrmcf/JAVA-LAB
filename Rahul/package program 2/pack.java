//import graphics.ap;
import arithmetic.addition;
import arithmetic.subtraction;
import arithmetic.multiplication;
import arithmetic.division;
import java.util.Scanner;
public class pack{
	public static void main(String args[])
	{
		addition a=new addition();
		subtraction s=new subtraction();
		multiplication m=new multiplication();
		division d=new division();
		Scanner sc=new Scanner(System.in);
		int op;
		do
		{
			System.out.println("\nEnter your choice: \n\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n");
			op=sc.nextInt();
			switch(op)
			{
			case 1:a.read();
					a.result();
					break;
			case 2:	s.read();
					s.result();
					break;
			case 3:	m.read();
					m.result();
					break;
			case 4:	d.read();
					d.result();
					break;
			case 5:break;
			
			default: System.out.println("INVALID INPUT");

				}

		}while(op!=5);
	}
}