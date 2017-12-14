package Labs;

import java.util.Arrays;

public class Lab3Two
{
	public static void main(String [] args)
	{
		//merge test code
		String[] array1 = {"apples"};
		String[] array2 = {"axes","balloons"};
	
		String [] sort = merge(array1, array2);
		for(int i = 0; i < sort.length; i++)
		{
			System.out.println(sort[i]);
		}
		System.out.print("\n");
		
		//mergeSort test code
		String[] array3 = {"cats", "dogs", "rats", "elephants", "chickens"};
		String[] sort2 = mergeSort(array3);
		for(int i = 0; i < sort.length; i++)
		{
			System.out.println(sort2[i]);
		}
		System.out.print("\n");
		
		//partition test code
		int[] array4 = {5, 1, 7, 8, 9, 5};
		int partitionTest = partition(array4);
		
		System.out.println("Counter: " + partitionTest);
	}
	/*
	 * Description: Merge 2 arrays together into 1 that is alphabetical
	 * Parameters: 2 different arrays to be merged
	 * Returns: 1 sorted array containing the elements of both arrays in its parameters
	 */
	public static String[] merge (String[] list1, String[] list2)
	{
		int count1 = 0; //index of list1
		int count2 = 0; //index of list2
		String[] newArray = new String[list1.length + list2.length]; 
		int newCount = 0; //index of newArray
		
		while(count1 < list1.length && count2 < list2.length)
		{
			if(list1[count1].compareTo(list2[count2]) < 0) 
			{
				/* compares list1[count1] and list2[count2], will return a number value
				 * if value is less than 0 then list1[count1] comes before list2[count2]
				 * else list2[count2] comes before list1[count1]
				 */
				newArray[newCount] = list1[count1];
				newCount++;
				count1++;
			}
			else 
			{
				newArray[newCount] = list2[count2];
				newCount++;
				count2++;
				
			}
		}
		
		/* if there are still values in the counts are less than the length of list then
		 * there are still objects in the list and these need to be added to the end of the newArray
		 */
		if(count2 < list2.length) 
		{
			for(int i = count2; i<list2.length; i++)
			{
				newArray[newCount] = list2[i];
				newCount++;
			}
		}
		if(count1 < list1.length)
		{
			for(int i = count1; i<list1.length; i++)
			{
				newArray[newCount] = list1[i];
				newCount++;
			}
		}
		return newArray;
	}
	/*
	 * Description: Sort an array
	 * Parameters: Array to be sorted
	 * Return: A sorted array
	 */
	public static String[] mergeSort(String[] list)
	{
		if(list.length == 1) //base case: returns the list if length is only one
		{
			return list;
		}
		else
		{
			String[] firstHalf = Arrays.copyOfRange(list, 0, (list.length/2));
			String[] secondHalf = Arrays.copyOfRange(list, (list.length/2), list.length);
			return merge(mergeSort(firstHalf),mergeSort(secondHalf)); //will call the merge function on the divided up arrays
		}
	}
	/*
	 * Description: Swap values within an array
	 * Parameters: Array to be used, position of first element to swap, position of second element to swap
	 * Return: Nothing
	 */
	public static void swapValues(int[] array, int x, int y)
	{
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
	/*
	 * Description: Uses first element as pivot, and arranges the array so all numbers less than pivot are in front and all greater than are in the back
	 * Parameters: Array of numbers
	 * Returns: The pivot position in the element.
	 */
	public static int partition(int[] list)
	{
		int pivotPosition = 0;
		int counter = 0;
		
		for(int i=1; i<list.length; i++)
		{
			if(list[pivotPosition] >= list[i])
			{
				counter++;
				swapValues(list, pivotPosition, i);
				pivotPosition = i;
			}
		}
		for(int i = counter-1; i<list.length; i++)
		{
			if(list[i] > list[pivotPosition]);
			swapValues(list, pivotPosition, i);
		}
		return counter;
	}
}