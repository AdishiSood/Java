/*

The java string compareTo() method compares the given string with current string lexicographically. It returns positive number, negative number or 0.

It compares strings on the basis of Unicode value of each character in the strings.

If first string is lexicographically greater than second string, it returns positive number (difference of character value). If first string is less than second string lexicographically, it returns negative number and if first string is lexicographically equal to second string, it returns 0.

*/

public class CompareTo{  
public static void main(String args[]){  
String s1="hello";  
String s2="hello";  
String s3="meklo";  
String s4="hemlo";  
String s5="flag";  
System.out.println(s1.compareTo(s2));//0 because both are equal  
System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
}}  
