
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean girl = false;
		boolean boy = false;
		int count = 0;

		while ( girl == false || boy == false) {
		 	if ( (Math.random() ) < 0.5 ){
		 		girl = true;
		 		System.out.print( "g ");
		 	}
		 	else {
		 		boy = true;
		 		System.out.print( "b ");
		 	}
		 	count ++;		 		
		 }

		System.out.println( " You made it... and you now have " + count + "children.");



	}
}
