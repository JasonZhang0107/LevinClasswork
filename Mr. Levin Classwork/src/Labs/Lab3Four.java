package Labs;

public class Lab3Four
{
	public static void main(String[] args)
	{
		//Partition test code
		/*
		int[] array = {7, 8, 5, 6, 10, 2, 9, 11, 3, 2, 15, 13};
		
		System.out.println(partition(array, 0, array.length-1));
		*/
		
		/*
		int[] array = {7, 8, 5, 6, 10};
		quickSort(array, 0, array.length-1);
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}*/
	}
	/*
	 * Description: Partitions an array of numbers based on the first element
	 * Parameter: Array of numbers, the beginning and ending position of the elements that should be sorted
	 * Return: The index of the pivot at the end of the partition, array is also partitioned according to the pivot
	 */
	public static int partition(int[] list1, int front, int back)
	{
		int pivotValue = list1[0];
		int low = front + 1;
		int high = back;
		
			while(low < high)
			{
				while ((list1[low] < pivotValue) && (low < high))
				{
					low++;
				}
				while((list1[high] > pivotValue) && (low < high))
				{
					high--;
				}
				if(low < high)
				{
					swapInt(list1, low, high);
					high--;
				}
				else
				{
					if(list1[low] >= pivotValue)
					{
						high--;
					}
				}
			}
			swapInt(list1, high, 0);
			
			return high;
	}
	/*
	 * Description: Recursively calls itself to sort a list
	 * Parameters: array to sort, starting and ending index
	 * Return: nothing
	 */
	public static void quickSort(int[] list1, int front, int back)
	{
		if(front < back)
		{
			int partitionIndex = partition(list1, front, back);
			
			quickSort(list1, front, partitionIndex-1);
			quickSort(list1, partitionIndex+1, back);
		}
	}
	/*
	 * Description: Swaps the values of 2 elements at different positions
	 * Parameters: array to take values from, position one, position two
	 * Return: nothing, but swaps value
	 */
	public static void swapInt(int[] array1, int x, int y)
	{
		int temp = array1[x];
		array1[x] = array1[y];
		array1[y] = temp;
	}
}
