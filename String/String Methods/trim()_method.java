/*

The java string trim() method eliminates leading and trailing spaces.
The unicode value of space character is '\u0020'.
The trim() method in java string checks this unicode value before and after the string, if it exists then removes the spaces and returns the omitted string.

*/

public class Trim
{  
public static void main(String args[])
{  
String s1="  hello string   ";  
System.out.println(s1+"github");//without trim()  
System.out.println(s1.trim()+"github");//with trim()  
}
}  
