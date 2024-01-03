
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean girl = false; 
		boolean boy = false; 
		int Children = 0;
		
		while (girl == false || boy == false) {
			double result = Math.random();
			
			if (result > 0.5) {
				girl = true;
				System.out.print("g ");
				Children += 1;
			} else {
				boy = true;
				System.out.print("b ");
				Children += 1;

			}
			
		}
		System.out.println();
		System.out.println("You made it... and you now have " + Children + " children."); 
	}
}
