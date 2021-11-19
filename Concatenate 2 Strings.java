// Java program to concatenate the two Strings
// using command line arguments

class BeingActual {

	// Function to concatenate the String
	public static String concat(String dest, String src)
	{

		// Return the concatenated String
		return (dest + src);
	}

	// Driver code
	public static void main(String[] args)
	{

		// Check if length of args array is
		// greater than 0
		if (args.length > 0) {

			// Get the command line arguments
			// and concatenate them
			System.out.println(concat(args[0], args[1]));
		}
		else
			System.out.println("No command line "
							+ "arguments found.");
	}
}
