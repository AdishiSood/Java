public class Subtract_Matrix  
{  
    public static void main(String[] args) {  
        int rows, cols;  
          int a[][] = {  
                          {1, 5, 6},  
                          {2, 4, 1},  
                          {3, 2, 3}  
                       };  
          int b[][] = {  
                          {5, 0, 3},  
                         {4, 3, 1},  
                         {0, 1, 1}  
                     };   
          rows = a.length;  
          cols = a[0].length;  
          int diff[][] = new int[rows][cols];   
        for(int i = 0; i < rows; i++)
        {  
            for(int j = 0; j < cols; j++){  
                diff[i][j] = a[i][j] - b[i][j];  
            }  
        }  
  
        System.out.println("Subtraction of two matrices: ");  
        for(int i = 0; i < rows; i++)
        {  
            for(int j = 0; j < cols; j++)
            {  
               System.out.print(diff[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }  
}    
