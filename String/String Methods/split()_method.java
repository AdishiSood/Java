/*

The java string split() method splits this string against given regular expression and returns a char array.

*/

public class Split
{
public static void main(String args[])
{
String s1="java string split method by github";
String[] words=s1.split("\\s");
//using java foreach loop to print elements of string array
for(String w:words)
{
System.out.println(w);
}
}
}

/*

result:

java
string
split
method
by
github

*/
