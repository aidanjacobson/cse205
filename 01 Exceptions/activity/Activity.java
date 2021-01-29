import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Driver class
 * 
 * @author Wade Huber
 *
 */
public class Activity {

	public static void main(String[] args) {
		try {
			Fraction sampleFraction = new Fraction(8,3);
			
			Scanner scan = new Scanner(System.in);

			System.out.print ("Enter the numerator:  ");
			sampleFraction.setNumerator(scan.nextInt());		
			System.out.print ("Enter the denominator:  ");
			sampleFraction.setDenominator(scan.nextInt());	

			System.out.println ("The fraction " + sampleFraction.getNumerator() + "/" +
					sampleFraction.getDenominator() + " is equal to " + sampleFraction.toMixedNumber());
			
			scan.close();
		} catch (InputMismatchException e) {
			System.out.println("Please enter an integer.");
		} catch (ArithmeticException e) {
			System.out.println("Please enter a valid computation.");
		} catch (Exception e) {
			// it's a long shot but might just work
			System.out.println("Please try again.");
		}
	}
}