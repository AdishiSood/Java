import java.util.Scanner;
class Sum
{
  public static void main(String[] args)
  {
    Scanner sc =new Scanner(System.in);
    int c[]=new int[10];
    int i,sum=0;
    for(i=0;i<c.length;i++)
    {
      c[i]=sc.nextInt();
    }
    for(i=0;i<c.length;i++)
    {
      sum=sum+c[i];
    }
    System.out.println(sum);
  }
}
