import java.util.Scanner;
public class circlearea
{
public static void main(String args[])
{
int r;
double area,perimeter;
System.out.println("Enter the radius of the circle: ");
Scanner sc=new Scanner(System.in);
r=sc.nextInt();
area=3.14*r*r;
perimeter=2*3.14*r;
System.out.println("Area of circle:"+area);
System.out.println("Perimeter of circle:"+perimeter);
}
}