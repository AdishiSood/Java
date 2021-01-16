import java.util.Scanner;

class CopyElements
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int c[]=new int[10];
     int a[]=new int[10];
    for(int i=0;i<c.length;i++)           
    {
      c[i]=sc.nextInt();
   }
for(int i=0;i<c.length;i++)
    {
      a[i]=c[c.length-1-i];
    }
    for(int i=0;i<c.length;i++)
    {
      System.out.println(a[i]);
    }
  }
}
