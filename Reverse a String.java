// Java program to reverse a string
// using command line arguments

class BeingActual {

	// Function to reverse the String
	public static String reverseString(String input)
	{

		// String to store the reverse
		String reversedString = "";

		// Loop through the string
		// character by character in reverse order
		// and store it into the resultant string
		for (int i = input.length() - 1; i >= 0; i--)
			reversedString += input.charAt(i);

		// Return the reversed String
		return reversedString;
	}

	// Driver code
	public static void main(String[] args)
	{

		// Check if length of args array is
		// greater than 0
		if (args.length > 0) {

			// Get the command line argument
			// and reverse it
			System.out.println(reverseString(args[0]));
		}
		else
			System.out.println("No command line "
							+ "arguments found.");
	}
}
