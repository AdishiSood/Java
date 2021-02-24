/*

Write a program to Rotate an array in clockwise direction(90degree)

*/
import java.util.Scanner;
class RotateArray
{
  public static void main(String[] args)
  {
Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-- > 0)
    {
      int r=sc.nextInt();
      int a[][]=new int[r][r];
      for(int i=0;i<r;i++)
        for(int j=0;j<r;j++)
        {
          a[i][j]=sc.nextInt();
        }
      for(int i=0;i<r;i++){
        for(int j=r-1;j>=0;j--){
          System.out.print(a[j][i]);
       if(j > 0)
            System.out.print(" ");
        }
        System.out.println("");
      }
      System.out.println("");
    }
  }
}
