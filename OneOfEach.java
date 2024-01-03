
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean Girl = false;
		boolean Boy = false;
		int children = 0;
		
		while ((Boy != true) || (Girl != true)) {
			if (Math.random() < 0.5) {
				Girl = true;
				System.out.print("g ");
				children++;
			}
			else {
			        Boy = true;
				System.out.print("b ");
				children++;
		}
		
	}
		System.out.println();
		System.out.println("You made it... and you now have " + children + " children.");
	}
}
