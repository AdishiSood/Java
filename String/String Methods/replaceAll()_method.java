/*

The java string replaceAll() method returns a string replacing all the sequence of characters matching regex and replacement string.

*/
public class ReplaceAll
{  
public static void main(String args[])
{  
String s1="How was your day";  
String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
System.out.println(replaceString);  //How wes your dey
}
}
