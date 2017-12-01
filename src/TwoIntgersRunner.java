
import java.util.Scanner;
public class TwoIntgersRunner 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);	
		System.out.println("This will add the first and second number together");
		System.out.println("Plug in your first number");
		double int1 = input.nextInt();
		System.out.println("Plug in your second number");
		double int2 = input.nextInt();
		TwoIntegers twointegers = new TwoIntegers(int1, int2);
		String arithmetic = twointegers.toArithmetic();
		System.out.println(arithmetic);
		String numberSize = twointegers.toNumberSize();
		System.out.println(numberSize);
	}
}