import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
class file2
{
	public static void main(String args[])
	{
		int x;
		try{
			FileWriter ob1=new FileWriter("even.txt");
			FileWriter ob2=new FileWriter("odd.txt");
			File ob3=new File("integers.txt");
			Scanner sc=new Scanner(ob3);
			while(sc.hasNextLine())
			{
				x=sc.nextInt();
				if(x%2==0)
				{
					ob1.write(String.valueOf(x));
				}
				else
				{
					ob2.write(String.valueOf(x));
				}
			}
				ob1.close();
				ob2.close();
			}
		catch(Exception e)		
		{

		}
		}
}