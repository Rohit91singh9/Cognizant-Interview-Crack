// Java program to reverse a string
// using command line arguments

class BeingActual {

	// Function to check if x is prime
	public static int isPrime(int x)
	{
		int i;

		// Loop to check if x has any factor
		// other than 1 and x itself
		for (i = 2; i < x / 2 + 1; i++) {
			if (x % i == 0) {
				// Since i is a factor of x
				// x is not prime
				return 0;
			}
		}

		// x is prime
		return 1;
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

			// Check if n is prime
			if (isPrime(n) == 1)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		else
			System.out.println("No command line "
							+ "arguments found.");
	}
}
