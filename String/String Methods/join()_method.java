/*

The java string join() method returns a string joined with given delimiter. In string join method, delimiter is copied for each elements.

In case of null element, "null" is added. The join() method is included in java string since JDK 1.8.

*/
public class join
{  
public static void main(String args[])
{  
String joinString1 = String.join("_","projects","on","github");  
System.out.println(joinString1);  //projects_on_github
}
}  
