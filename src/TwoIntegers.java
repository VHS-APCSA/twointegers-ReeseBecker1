
public class TwoIntegers 
{
	private int num1;
	private int num2;
	private int sum;
	public TwoIntegers()
	{
		num1 = 0;
		num2 = 0;
	}
	public TwoIntegers(int num1, int num2, int sum)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.sum = sum;
	}
	public int sum()
	{
		return sum;
	}
	public int getNum1()
	{
		return num1;
	}
	public int getNum2()
	{
		return num2;
	}
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
}