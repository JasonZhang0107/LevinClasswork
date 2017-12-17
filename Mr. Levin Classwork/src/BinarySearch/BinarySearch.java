package BinarySearch;

public class BinarySearch
{
	public static void main(String [] args)
	{
		int [] test1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int [] test2 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
		
		for(int i = -1; i<test1.length+1; i++)
		{
			System.out.print(binarySearch(test1, i, 0, test1.length));
		}
		System.out.println();
		for(int i = -1; i<test2.length+1; i++)
		{
			System.out.print(binarySearch(test2, 1, 0, test2.length));
		}
		System.out.println();
	}
	public static int binarySearch(int [] nums, int query, int first, int last)
	{
		if(first < last)
		{
			int index = (first+last)/2;
			int guess = nums[index];
			
			if(guess == query)
			{
				return index;
			}
			if(guess > query)
			{
				return binarySearch(nums, query, first, index - 1);
			}
				return binarySearch(nums, query, index + 1, last);
		}
		return -1;
	}
}
