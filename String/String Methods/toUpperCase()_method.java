/*

The java string toUpperCase() method returns the string in uppercase letter. In other words, it converts all characters of the string into upper case letter.

The toUpperCase() method works same as toUpperCase(Locale.getDefault()) method. It internally uses the default locale.


*/

public class StringUpperExample
{  
public static void main(String args[])
{  
String s1="hello string";  
String s1upper=s1.toUpperCase();  
System.out.println(s1upper);  
}
}  
