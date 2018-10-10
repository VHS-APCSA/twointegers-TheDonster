
public class TwoIntegers 
{
	private int name1;
	private int name2;
	
	public TwoIntegers()
	{
		name1 = 2 ;
		name2 = 4 ;
	}
	public TwoIntegers(int name1, int name2)
	{
		this.name1 = name1;
		this.name2 = name2;
	}
	public int getName1()
	{
		return name1;
	}
	public void setName1(int name1)
	{
		this.name1 = name1;
	}
	public int getName2()
	{
		return name2;
	}
	public void setName2(int name2)
	{
		this.name2 = name2;
	}
	public String arithmetic()
	{
		int sum = name1 + name2;
		int product = name1 * name2;
		int difference = name1 / name2;
		int quotient = name1 % name2;
		
		String str = name1 + " + " + name2 + " = " + sum + ", " + name1 + "x" + name2 + "=" + product + "," + name1 + "/" + name2 + "=" + difference + "," + name1 + "%" + name2 + "=" + quotient;
		return str;
	}
	public int largest()
	{
		if (name1 > name2) 
		{
			return name1;
		}
		else
			return name2;
	}
	public boolean isEven()
	{
		int sum = name1 + name2;
		
		if (sum % 2 == 0)
		{
			return true;
		}
		else
			return false;
	}
	public boolean twoPointTwoSix()
	{
		if (name2 % name1 == 0)
		{
			return true;
		}
		else
			return false;
	}
}