/*
We can find the second smallest number in an array in java by sorting the array and returning the 2nd element.
*/
public class SecondSmallest
{  
public static int getSecondSmallest(int[] a, int total)
{  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[1];//2nd element because index starts from 0  
}  
public static void main(String args[])
{  
int a[]={1,21,45,86,38,2};  
int b[]={4,86,29,97,33,12,95};  
System.out.println("Second smallest: "+getSecondSmallest(a,6));  
System.out.println("Second smallest: "+getSecondSmallest(b,7));  
}
}  
