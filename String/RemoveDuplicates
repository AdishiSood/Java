// Java program to remove duplicate character from character array and print in sorted order 
import java.util.*; 

class RemoveDuplicates
{ 
	static String removeDuplicate(char str[], int n) 
	{ 
		int index = 0; 
		// Traverse through all characters 
		for (int i = 0; i < n; i++) 
		{ 

			// Check if str[i] is present before it 
			int j; 
			for (j = 0; j < i; j++) 
			{ 
				if (str[i] == str[j]) 
				{ 
					break; 
				} 
			} 

			// If not present, then add it to 
			// result. 
			if (j == i) 
			{ 
				str[index++] = str[i]; 
			} 
		} 
		return String.valueOf(Arrays.copyOf(str, index)); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		char str[] = "MyjavaProgram".toCharArray(); 
		int n = str.length; 
		System.out.println(removeDuplicate(str, n)); 
	} 
} 
