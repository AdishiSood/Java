/*

Java Program to display the lower triangular matrix
Lower triangular matrix is a square matrix in which all the elements above the principle diagonal will be zero.
To find the lower triangular matrix, a matrix needs to be a square matrix that is, the number of rows and columns in the matrix need to be equal.
Dimensions of a typical square matrix can be represented by n x n.

*/
public class LowerTriangular    
{    
    public static void main(String[] args)
    {    
    int rows, cols;       
        int a[][] = {       
                        {1, 2, 3},    
                        {9, 8, 5},    
                        {7, 6, 4}    
                    };     
          rows = a.length;    
          cols = a[0].length;              
          if(rows != cols)
          {    
              System.out.println("Matrix should be a square matrix");    
          }    
          else 
          {     
              System.out.println("Lower triangular matrix: ");    
              for(int i = 0; i < rows; i++)
              {    
                  for(int j = 0; j < cols; j++){    
                    if(j > i)    
                      System.out.print("0 ");    
                    else    
                      System.out.print(a[i][j] + " ");    
                }    
                System.out.println();    
            }    
        }    
    }    
}    
