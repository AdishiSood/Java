/*

The java string format() method returns the formatted string by given locale, format and arguments.

If you don't specify the locale in String.format() method, it uses default locale by calling Locale.getDefault() method.

The format() method of java language is like sprintf() function in c language and printf() method of java language.

*/

public class Format{
  
public static void main(String args[])
{  
String name="raghav";  
String sf1=String.format("name is %s",name);  
String sf2=String.format("value is %f",56.27362);  
String sf3=String.format("value is %32.12f",28.9387);//returns 12 char fractional part
  
System.out.println(sf1);  
System.out.println(sf2);  
System.out.println(sf3);  
}
}  
