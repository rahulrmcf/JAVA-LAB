import java.util.Scanner;
public class string{
public static void main(String args[])
{
	Scanner sn=new Scanner(System.in);
	String s1,s2;
	System.out.println("Enter the first string: ");
	s1=sn.next();
	System.out.println("Enter the second string: ");
	s2=sn.next();
	System.out.println("Length of "+s1+" is "+s1.length());
	System.out.println("Upper case String 1: "+s1.toUpperCase()+" "+s2.toUpperCase());
	System.out.println("Lower case String 1: "+s1.toLowerCase()+" "+s2.toLowerCase());
	System.out.println("Index of a:"+s1.indexOf('a'));
	System.out.println("CharAt(2):"+s1.charAt(2));
	System.out.println("Concatination: "+s1+s2);
	System.out.println("Substring: "+s1.substring(1,4));
	System.out.println("Trim: "+s1.trim());
}
}