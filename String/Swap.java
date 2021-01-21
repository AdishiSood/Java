/*
Write a program which swaps first and last character of each word of a String.
*/
import java.util.Scanner;

class Result
{
  static String swapFirstLastChar(String str)
  {
String token[]=str.split(" ");
    String res="";
    for(int i=0;i<token.length;i++)
    {
      char a[]=token[i].toCharArray();
      char b =token[i].charAt(0);
      a[0]=a[a.length-1];
      a[a.length-1]=b;
      for(int j=0;j<a.length;j++)
      {
        res+=a[j];
      }
      if(i!=token.length-1)
        res+=" ";
    }
    return res;
  }
}
class Swap
{
  public static void main(String[] args)
  {
    int t,i,j=0;
    String a, b;
    Scanner s=new Scanner(System.in);
    t=Integer.parseInt(s.nextLine());
    while(t != 0)
    {
      a = s.nextLine();
      b=Result.swapFirstLastChar(a);
      System.out.println(b);
      t--;
    }
  }
}
