public class Missing
{
    static int getMissingNo (int a[], int n)
    {
        int i, total;
     	total  = (n + 1) * (n + 2) / 2;
     	for ( i = 0; i < n; i++)
     	total -= a[i];
     	return total;
    }
    public static void main(String args[])
    {
      	int a[ ] = {1, 2, 4, 5, 6};
      	int miss = getMissingNo(a, 5);
      	System.out.println("The number missing is :"+miss);
    }
}
