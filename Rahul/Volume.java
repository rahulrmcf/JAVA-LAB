import java.util.Scanner;
public class Volume
{
public static void main(String args[])
{
int l,b,h,v;
System.out.println("Enter the length, breadth & height: ");
Scanner sc=new Scanner(System.in);
l=sc.nextInt();
b=sc.nextInt();
h=sc.nextInt();
v=(l*b*h);
System.out.println("Volume of box:"+v);
}
}