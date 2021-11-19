// Java program to check if N is a leap year
// using command line arguments

class BeingActual {

	// Function to check
	// if year is a leap year or not
	public static int isLeapYear(int year)
	{

		// Return 1 if year is a multiple
		// 0f 4 and not multiple of 100.
		// OR year is multiple of 400.
		if (((year % 4 == 0)
			&& (year % 100 != 0))
			|| (year % 400 == 0))
			return 1;
		else
			return 0;
	}

	// Driver code
	public static void main(String[] args)
	{

		// Check if length of args array is
		// greater than 0
		if (args.length > 0) {

			// Get the command line argument and
			// Convert it from string type to integer type
			int n = Integer.parseInt(args[0]);

			// Check if n is a leap year
			if (isLeapYear(n) == 1)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		else
			System.out.println("No command line "
							+ "arguments found.");
	}
}
