package Lab3Three;

public class Lab3Three
{
	public static void main (String[] args)
	{
		//bubble sort test code
		System.out.println("Bubble Sort Test Code");
		String[] array1 = {"bananas", "apples", "dogs", "eggs"};
		
		bubbleSort(array1);
		
		for(int a = 0; a<array1.length; a++)
		{
			System.out.println(array1[a]);
		}
		
		//selection sort test code
		System.out.println("<-------------------------------------->");
		System.out.println("Selection Sort Test Code");
		double[] array2 = {1.15, 1.13, 1.12, 1.19, 1.11, 1.14, 1.18};
		
		selectionSort(array2);
		
		for(int b = 0; b<array2.length; b++)
		{
			System.out.println(array2[b]);
		}
		
		//insertionSort test code
		System.out.println("<-------------------------------------->");
		System.out.println("Insertion Sort Test Code");
		
		int[] array3 = {1, 5, 7, 8, 4, 2, 3};
		
		insertionSort(array3);
		
		for(int c = 0; c<array3.length; c++)
		{
			System.out.println(array3[c]);
		}
		
	}
	/*
	 * Description: Takes each element and adds it to the front of the array in the correct order
	 * Parameters: array with all int
	 * Return: nothing, but the array is sorted in ascending order
	 */
	public static void insertionSort(int[] list1)
	{		
		for(int i = 0; i<list1.length; i++)
		{
			for(int j = i; j > 0; j--)
			{
				if(list1[j] < list1[j-1])
				{
					swapInt(list1, j-1, j);
				}
			}
		}
	}
	/*
	 * Description: Finds the lowest element and moves it to the front of the array until array is sorted
	 * Parameters: array with all double
	 * Return: nothing, but the array is sorted in ascending order
	 */
	public static void selectionSort(double[] list1)
	{
		int counter = 0;
		
		for(int i = 0; i<list1.length-1; i++)
		{
			double min = list1[i];
			int position = i;
			
			for(int j = i + 1; j<list1.length; j++)
			{
				if(list1[j] < min)
				{
					min = list1[j];
					position = j;
				}
			}
			swapDoubles(list1, counter, position);
			counter++;
		}
	}
	/*
	 * Description: Iterates through the array swapping any out of order elements
	 * Parameters: array with all Strings
	 * Return: nothing, but the array is sorted in ascending order
	 */
	public static void bubbleSort(String[] list1)
	{
		boolean sorted = false;
		
		while(!sorted)
		{
			sorted = true;
			for(int i = 0; i<list1.length-1; i++)
			{
				if(list1[i].compareTo(list1[i+1]) > 0)
				{
					swapStrings(list1, i, i+1);
					sorted = false;
				}
			}
		}
	}
	/*
	 * Description: Swaps the String values at different index
	 * Parameter: String array, position 1 to be swapped, position 2 to be swapped
	 * Return: Nothing, but positions are swapped
	 */
	public static void swapStrings(String[] array, int x, int y)
	{
		String temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
	/*
	 * Description: Swaps the double values at different index
	 * Parameter: double array, position 1 to be swapped, position 2 to be swapped
	 * Return: Nothing, but positions are swapped
	 */
	public static void swapDoubles(double[] array, int x, int y)
	{
		double temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
	/*
	 * Description: Swaps the int values at different index
	 * Parameter: int array, position 1 to be swapped, position 2 to be swapped
	 * Return: Nothing, but positions are swapped
	 */
	public static void swapInt(int[] array, int x, int y)
	{
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
}
