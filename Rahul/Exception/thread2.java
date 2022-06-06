import java.util.Scanner;

class even implements Runnable
{
	int n;
	Scanner sn=new Scanner(System.in);
	public void run()
{
	System.out.println("Enter the limit of even numbers: ");
	n=sn.nextInt();
	System.out.println("Even numbers:");
	for (int i=1;i<=n;i++) {
	if(i%2==0)
{
	System.out.print(" "+i);
			}
}
}
}

class fibo implements Runnable
{
	int n,a=0,b=1,c=0,i=0;
	Scanner sn=new Scanner(System.in);
	public void run()
{
	System.out.println("Enter the limit of fibonacci series: ");
	n=sn.nextInt();
	System.out.println("Fibonacci series:");
	while(i<n)
{
			
			
	System.out.print(" "+c);
	c=a+b;
	a=b;
	b=c;
	i++;
}
}

}
class thread2{
	public static void main(String[] args) 
{
	even or=new even();
	fibo f1=new fibo();
	Thread t1=new Thread(or);
	Thread t2=new Thread(f1);
	t1.start();
	t2.start();
}
}