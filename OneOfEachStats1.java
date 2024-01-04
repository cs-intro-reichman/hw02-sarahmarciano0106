/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
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

				if ( (Math.random() ) < 0.5 )
					girl = true;
		 	    else
		 	    	boy = true;

		 	    count ++;
		 	    sum = sum + count;
		 	}

		 
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

		int max= Math.max( two, Math.max(three, fourMore));
		int common = 0 ;
		if (max == two)
			common = 2;
		else 
			if(max == three)
				common = 3;
			else 
				common = 4;

		System.out.println(" Average: " + (sum / t) + " children to get at least one of each gender." );
		System.out.println(" Number of families with 2 children: " + two );
		System.out.println(" Number of families with 3 children: " + three);
		System.out.println(" Number of families with 4 or more children: " + fourMore );
		if (common == 4)
			System.out.println(" The most common number of children is " + common + " or more.");
		else 
			System.out.println(" The most common number of children is " + common );





	}
}
