import java.util.*;
class Palindrome
{
public static void main(String[] args)
{
  int j=0;
  String a;
  Scanner s=new Scanner(System.in);
  a = s.nextLine().trim();
  j=countPalindrome(a);
  System.out.println(j);
}
}
static int countPalindrome(String str)
{
String token[]=str.split(" ");
  int count=0;
  for(int i=0; i<token.length; i++)
  {
    StringBuffer a =new StringBuffer(token[i]);
    a.reverse();
    String b =a.toString().toLowerCase();
    if(token[i].toLowerCase().equals(b))
      count++;
  }
  return count;
}
}
