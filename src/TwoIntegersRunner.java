
public class TwoIntegersRunner 
{
	public static void main(String[] args)
	{
		TwoIntegers twoIntegers = new TwoIntegers(2, 4);
		String first = twoIntegers.arithmetic();
		System.out.println(first);
		
		int largest = twoIntegers.largest();
		System.out.println(largest);
		
		boolean isEven = twoIntegers.isEven();
		System.out.println(isEven);
		
		boolean twoPointTwoSix = twoIntegers.twoPointTwoSix();
		System.out.println(twoPointTwoSix);
	}
	
}
//print other method