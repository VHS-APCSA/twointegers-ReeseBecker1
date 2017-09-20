import java.util.Scanner;
public class TwoIntgersRunner 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);	
		int num1 = 0;
		int num2 = 0;
		int sum = num1 + num2;
		
		System.out.println("Enter first integer");
		num1 = input.nextInt();
		System.out.println("Enter second integer");
		num2 = input.nextInt();
		sum = num1 + num2;
		System.out.println(sum);
		
	}
}