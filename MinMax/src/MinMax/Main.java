package MinMax;

public class Main {

	public static void main(String[] args) 
	{
		
	//   ------------------------- UC-1 -------------------------------
		
			// max of 3 integer values
			MaxFinder<Integer> maxfinderobject1 = new MaxFinder<>(2,3,4);
			System.out.println(maxfinderobject1.testMaximum());
			
	//   ------------------------- UC-2 -------------------------------		
			
			// max of 3 double values
			MaxFinder<Double> maxfinderobject2 = new MaxFinder<>(2.3,3.1,4.2);
			System.out.println(maxfinderobject2.testMaximum());
			
	//   ------------------------- UC-3 -------------------------------	
			
			// max of 3 string values
			MaxFinder<String> maxfinderobject3 = new MaxFinder<>("ab","abcf","er");
			System.out.println(maxfinderobject3.testMaximum());
			
	//   ------------------------- UC-4 -------------------------------	
			
			// find max for more than 3 elements
			AllMaxFinder<Double> doubleMaxFinder = new AllMaxFinder<>(10.5, 25.3, 15.8, 30.2, 5.9);
	        doubleMaxFinder.testMaximum();

	}

}
