// Java program to find
// the sum of digits of a number
// using command line arguments

class BeingActual {

	// Function to Find the sum of digits
	public static int findSumOfDigits(int num)
	{

		// Variable to store the
		// the sum of digits
		int sum = 0;

		// Traverse through the number digit by digit
		while (num > 0) {

			// Add the last digit of num
			// to the sum
			sum = sum + (num % 10);

			// Remove the last digit from the num
			num = num / 10;
		}

		// Return the sum
		return sum;
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

			// Find the sum of digits and print it
			System.out.println(findSumOfDigits(n));
		}
		else
			System.out.println("No command line "
							+ "arguments found.");
	}
}
