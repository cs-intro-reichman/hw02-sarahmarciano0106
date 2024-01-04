import java.util.Random;

public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		int t = Integer.parseInt(args[0]);
		double sum = 0;
		int two = 0;
		int three = 0;
		int fourMore = 0;
		boolean girl = false;
		boolean boy = false;
		int count = 0;

		for( int i = 1; i <= t; i++){
			while ( girl == false || boy == false) {

				if ( ( generator.nextDouble() ) < 0.5 )
					girl = true;
		 	    else
		 	    	boy = true;

		 	    count ++;
		 	}

		 	sum = sum + count;

		 	if ( count == 3)
		 	     three ++;
		 	if ( count >= 4)
		 	    fourMore ++;
		 	if ( count == 2)
		 		two++;


		 	count = 0;
		 	girl = false;
		 	boy = false;
		 
		}

		System.out.println("Average: " + (sum / t) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + two );
		System.out.println("Number of families with 3 children: " + three);
		System.out.println("Number of families with 4 or more children: " + fourMore );

		int max= Math.max( two, Math.max(three, fourMore));
		if (max == two)
			System.out.println("The most common number of children is 2.");
		else
			if (max == three)
				System.out.println("The most common number of children is 3.");
			else 
				System.out.println("The most common number of children is 4 or more.");


	}
}

