// Java program to compute the average of two numbers
// using command line arguments

class BeingActual {

	// Function to compute the average of two numbers
	static int average(int a, int b)
	{
		return (a + b) / 2;
	}

	// Driver code
	public static void main(String[] args)
	{

		// Check if length of args array is
		// greater than 0
		if (args.length > 0) {

			// Get the command line argument and
			// Convert it from string type to integer type
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			// Find the average
			int res = average(num1, num2);

			// Print the average
			System.out.println(res);
		}
		else
			System.out.println("No command line "
							+ "arguments found.");
	}
}
