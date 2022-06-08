import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
 class file{
 	public static void main(String[] args) {
 		try{
  		FileWriter f1=new FileWriter("sample.txt");
  		Scanner sf=new Scanner(System.in);
  		System.out.println("Enter the String:");
  		String s=sf.next();
 		f1.write(s);
 		f1.close();
 		File f2=new File("sample.txt");
 		Scanner sn=new Scanner(f2);
	 		while(sn.hasNextLine())
	 		{
	 			 String data = sn.nextLine();
	 			System.out.println(data);
	 		}
		}
 		catch(Exception e){
 			System.out.println(e);
 		}
 		
 	}
 }