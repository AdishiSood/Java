/*

You are given a list of n-1 integers and these integers are in the range of 1 to n.
There are no duplicates in the list. One of the integers is missing in the list.
Write an efficient code to find the missing integer.

*/
public class MissingNumber
{
    static int getMissingNo (int a[], int n)
    {
        int i, total;
     	total  = (n + 1) * (n + 2) / 2;
     	for ( i = 0; i < n; i++)
     	total - = a[i];
     	return total;
    }
    public static void main(String args[])
    {
      	int a[] = {4,3,1,2,6};
      	int miss = getMissingNo(a, 5);
      	System.out.println("The number missing is : " + miss);
    }
}
