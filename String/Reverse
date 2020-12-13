/*Write a function to reverse a string.

  void reverseString (char str[]);

  reverseString (char str[]) will receive a string as input and reverse the string.
*/
import java.util.Scanner;

class Main
{
  static String reverseString(String str)
  {
   StringBuffer a = new StringBuffer();
   a.append(str);
   a.reverse();
   return a.toString();
 }

 public static void main(String[] args)
 {
  String str;
  int test;
  Scanner s=new Scanner(System.in);
  test=Integer.parseInt(s.nextLine());
  while(test!=0)
  {
   str=s.nextLine();
   System.out.println(reverseString(str));
   test--;
  }
 }
}
