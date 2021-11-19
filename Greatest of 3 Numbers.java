// Java program to compute the greatest of three numbers
// using command line arguments

class BeingActual {

	// Function to compute the greatest of three numbers
	static int greatest(int A, int B, int C)
	{

		if (A >= B && A >= C)
			return A;

		if (B >= A && B >= C)
			return B;

		return C;
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
			int num3 = Integer.parseInt(args[2]);

			// Find the greatest
			int res = greatest(num1, num2, num3);

			// Print the greatest
			System.out.println(res);
		}
		else
			System.out.println("No command line "
							+ "arguments found.");
	}
}
