
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean g = false;
		boolean b = false;
		int count = 0;

		while ( g == false || b == false) {
		 	if ( (Math.random() ) < 0.5 ){
		 		g = true;
		 		System.out.print( "g ");
		 	}
		 	else {
		 		b = true;
		 		System.out.print( "b ");
		 	}
		 	count ++;		 		
		 }

		System.out.println( " You made it... and you now have " + count + "children.");



	}
}
