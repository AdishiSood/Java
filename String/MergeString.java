import java.io.BufferedReader;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
public class MergeString
{
    public static String merge(String s1, String s2) // Function for alternatively merging two strings
    {
        StringBuilder result = new StringBuilder(); // To store the final string
        for (int i = 0; i < s1.length() || i < s2.length(); i++) 
        {
            if (i < s1.length())    // First choose the ith character of the first string if it exists
                result.append(s1.charAt(i));
            if (i < s2.length())   // First choose the ith character of the second string if it exists
                result.append(s2.charAt(i));
        }
        return result.toString();
    }
 
    // Driver code
    public static void main(String[] args)throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String s1=b.readLine();
        String s2=b.readLine();
        System.out.println(merge(s1, s2));
    }
}
