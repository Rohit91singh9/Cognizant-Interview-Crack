// Java program to swap the two numbers
// using command line arguments

class BeingActual {

	// Function to swap the two numbers
	static void swap(int x, int y)
	{
		// Code to swap ‘x’ and ‘y’

		// x now becomes x+y
		x = x + y;

		// y becomes x
		y = x - y;

		// x becomes y
		x = x - y;

		System.out.println(x + " " + y);
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

			// Swap the numbers
			swap(num1, num2);
		}
		else
			System.out.println("No command line "
							+ "arguments found.");
	}
}
