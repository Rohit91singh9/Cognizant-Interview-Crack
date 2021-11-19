// Java program to compute the HCF of two numbers
// using command line arguments

class BeingActual {

	// Function to compute the HCF of two numbers
	static int HCF(int a, int b)
	{
		if (b == 0)
			return a;

		return HCF(b, a % b);
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

			// Find the HCF
			int res = HCF(num1, num2);

			// Print the HCF
			System.out.println(res);
		}
		else
			System.out.println("No command line "
							+ "arguments found.");
	}
}
