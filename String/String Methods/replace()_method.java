/*
The java string replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.

Since JDK 1.5, a new replace() method is introduced, allowing you to replace a sequence of char values.

*/
public class replace
{  
public static void main(String args[])
{  
String s1="hello amigos";  
String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
System.out.println(replaceString);  //hello emigos
}
}  
