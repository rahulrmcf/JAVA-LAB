import java.util.Scanner;

public class Matrix {
  
  
  private static Scanner scan = new Scanner(System.in);

  
  public static void main(String[] args) {
    
    
    int row = 0;
    int column = 0;
    int a[][] = null; 
    int b[][] = null; 
    int c[][] = null; 
    
    
    System.out.println("Enter row and column size: ");
    row = scan.nextInt();
    column = scan.nextInt();

    
    a = new int[row][column];
    b = new int[row][column];
    c = new int[row][column];
    
    
    System.out.println("Enter Matrix A: ");
    a = readMatrix(a);
    System.out.println("Enter Matrix B: ");
    b = readMatrix(b);

    
    c = addMatrix(a, b);

    
    System.out.println("Sum (C): ");
    for(int i=0; i<c.length; i++) {
      for(int j=0; j<c[0].length; j++) {
        System.out.print(c[i][j]+" ");
      }
      System.out.println(); 
    }
  }
  
  public static int[][] readMatrix(int[][] temp) {
    for(int i=0; i<temp.length; i++) {
      for(int j=0; j<temp[0].length; j++) {
        temp[i][j] = scan.nextInt();
      }
    }
    return temp;
  }

  public static int[][] addMatrix(int[][] a, int[][] b) {
    int row = a.length;
    int column = a[0].length;
    
    int sum[][] = new int[row][column];
    
    
    for(int i=0; i<row; i++) {
      
      for(int j=0; j<column; j++) {
       
        sum[i][j] = a[i][j] + b[i][j];
      }
    }
    
    return sum;
  }

}