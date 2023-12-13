package MinMax;

public class AllMaxFinder<T extends Comparable<T>>
{
	private T[] variables;

    // Parameterized constructor
    public AllMaxFinder(T... variables) {
        this.variables = variables;
    }

    // Method to find the maximum of all variables
    public T testMaximum() {
        if (variables.length == 0) {
            throw new IllegalArgumentException("No variables provided");
        }

        T max = variables[0];

        for (int i = 1; i < variables.length; i++) {
            if (variables[i].compareTo(max) > 0) {
                max = variables[i];
            }
        }

        printMax(max); // Call the printMax method
        return max;
    }
   // Generic method to print the maximum value to standard output
    public void printMax(T max) {
        System.out.println("The maximum value is: " + max);
    }
}
