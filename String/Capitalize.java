 import java.util.Scanner;
class Capitalize
static String capitalizeFirstChar(String str)
{
String token[]=str.split(" ");
  String res="";
  for(int i=0;i<token.length;i++)
  {
  res+= token[i].toUpperCase().charAt(0);
   res+=token[i].substring(1);
    if(i!=token.length-1)
      res+=" ";
  }
  return res;
}

 public static void main(String[] args)
 {
  int t,i,j=0;
  String a, b;
  Scanner s=new Scanner(System.in);
  t=Integer.parseInt(s.nextLine());
  while(t != 0)
  {
    a = s.nextLine();
    b=capitalizeFirstChar(a);
    System.out.println(b);
    t--;
  }
 }
}
