/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int i = Integer.parseInt(args[0]); 
      int sum = 0 ;
      for(int divisor = 1; divisor < i; divisor++) {
         if(i%divisor == 0) {
            sum = sum + divisor ; 
         }
      }
      if(i==sum) {
         System.out.print(i + " is a perfect number since " + i + " = " + "1"); 
         for(int divisor = 2; divisor < i; divisor++) {
             if(i%divisor == 0) {
             System.out.print(" + " + divisor);
             }
          }
      }
      else 
         System.out.println(i + " is not a perfect number ");

	}
}
