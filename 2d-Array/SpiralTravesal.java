/*

Traversing an array is an elementary operation on an array, in which each element will be processed for some operation.

*/
import java.util.Scanner;
class Result
{
  static void printSpiral(int a[][], int r, int c)
  {
     int m=0,n=0,i;
    while(m<r && n<c)
    {
     for(i=n;i<c;i++)
     {
       System.out.println(a[m][i]);
     }m++;
      
      for(i=m;i<r;i++)
      {
        System.out.println(a[i][c-1]);
      }c--;
      if(m<r)
      {
        for(i=c-1;i>=n;i--)
          System.out.println(a[r-1][i]);
          r--;
      }
      if(n<c)
      {
        for(i=r-1;i>=m;i--)
          System.out.println(a[i][n]);
            n++;
      }
    }
  }
}
class Main
{
  public static void main(String[] args)
  {
    int r, c, i, j;
    Scanner sc = new Scanner(System.in);
    r = sc.nextInt();
    c = sc.nextInt();
    int a[][] = new int[50][50];
    for(i = 0; i < r; i++)
      for(j = 0; j < c; j++)
        a[i][j] = sc.nextInt();
    Result.printSpiral(a, r, c);
  }
}
