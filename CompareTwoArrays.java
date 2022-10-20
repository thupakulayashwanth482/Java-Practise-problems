// Java Program to Check If Two Arrays Are Equal
// Using deepEquals() method of Arrays class

// Importing required classes
import java.util.Arrays;

// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Declaring and initializing integer arrays
		// having same values

		// Array 1
		int inarr1[] = { 1, 2, 3 };
		// Array 2
		int inarr2[] = { 1, 2, 3 };

		// Array 1 contains only one element
		Object[] arr1 = { inarr1 };
		// Array 2 also contains only one element
		Object[] arr2 = { inarr2 };

		// Checking if arrays are equal or not
		// using deepEquals() method
		if (Arrays.deepEquals(arr1, arr2))

			// Print statement if arrays are same
			System.out.println("Same");
		else

			// Print statement if arrays are not same
			System.out.println("Not same");
	}
}

