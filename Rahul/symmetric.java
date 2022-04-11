import java.util.Scanner;
public class symmetric{
	public static void main (String args[]){
		int  a[][]=new int [5][5];
		int  c[][]=new int [5][5];
		boolean symmetric = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
        int rows = scan.nextInt();
        System.out.println("Enter the number of columns : ");
        int cols = scan.nextInt();
		if (rows!=cols){
			return;
		}
		System.out.println("Enter the Matrix: ");
		for (int i = 0; i <rows; i++) {
            for (int j = 0; j <cols; j++) {
                a[i][j] = scan.nextInt();
                }
            }
		System.out.println("The First matrix: ");
            for (int i = 0; i <rows; i++) {
                for (int j = 0; j <cols; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
		for (int i = 0; i <rows; i++) {
            for (int j = 0; j <cols; j++) {
                c[i][j] =a[j][i];
                }
            }
		System.out.println("Transpose matrix: ");
            for (int i = 0; i <rows; i++) {
                for (int j = 0; j <cols; j++) {
                    System.out.print(c[i][j] + "\t");
                }
                System.out.println();
            }
		if (rows!=cols){
			return;
		}
		
		for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    if(a[i][j] != c[i][j])
                    {
                        symmetric = false;
                    }
                }
            }
            
            if(symmetric)
            {
                System.out.println("It is a symmetric matrix");
            }
            else
            {
                System.out.println("It is not a symmetric matrix");
            }
        }
		 
	}