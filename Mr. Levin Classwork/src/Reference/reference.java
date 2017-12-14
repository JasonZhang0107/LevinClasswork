package Reference;

public class reference 
{

	public static void main(String[] args) 
	{
		String[] shoppingList = {"brownrice", "broccoli", "salmon"};	
		printArray(doubleArray(shoppingList));
		
	}
	public static String doubled(String str1)
	{
		str1 = str1 + str1;
		return str1;
	}
	public static String[] doubleArray(String [] array)
	{
		for(int x=0; x<array.length; x++)
		{
			array[x] = doubled(array[x]);
		}
		return array;
	}
	private static void printArray(Object [] array)
	{
		for(Object x: array)
		{
			System.out.println(x);
		}
	}
}
