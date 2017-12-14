package Labs;

public class Lab3One
{
	public static void main(String args[])
	{
		//removeDuplicates testing, works as intended
		int[] duplicateArray;
		duplicateArray = new int[] {1, 2, 2, 3, 3, 2, 4, 4, 4, 3};
		
		System.out.println("Original duplicate array contains the following numbers: ");
		for(int x=0; x<duplicateArray.length; x++)
		{
			System.out.println(duplicateArray[x] + " ");
		}
		System.out.print("\n");
		
		int[] newArray = removeDuplicates(duplicateArray);
		System.out.println("New array with duplicates removed contains the following numbers: ");
		for(int x=0; x<newArray.length; x++)
		{
			System.out.println(newArray[x] + " ");
		}
		System.out.print("\n");
		
		//Used to test productArray, works as intended
		int[] array1;
		array1 = new int[] {1, 2, 3, 4, 5};
		
		int[] array2;
		array2 = new int[] {1, 2, 3, 4, 5};
		
		productArray(array1, array2);
		
		//Creates a Pascal Triangle
		int [][] finalPascalTriangle = pascalTriangle(5);
		
		//Prints the final Pascal triangle
		System.out.print("Pascal Triangle below has "+finalPascalTriangle.length+ " rows.\n");
		printPascalTriangle(finalPascalTriangle);
	}
	/*
	 * Description: Removes all duplicates from the array of numbers
	 * Parameters: Array to remove duplicates from
	 * Returns: New array with all the duplicates removed
	 */
	public static int[] removeDuplicates(int [] list)
	{	
		int[] array = copyArray(list);
		boolean[] booleanArray = new boolean[list.length];
		
	 	int unique = 0;
	 	boolean uniqueNum = true;
	 	booleanArray[0] = true;
	 	for(int i = 0; i < array.length; i++)
	 	{
	 		uniqueNum = true;
	 		for(int j = i + 1; j < array.length; j++)
	 		{
	 			if(array[i] == array[j])
	 			{
	 				uniqueNum = false;
	 			}
	 		}
	 		if(uniqueNum)
 			{
	 			booleanArray[i] = true;
 				unique++;
 			}
	 		else
	 		{
	 			booleanArray[i] = false;
	 		}
	 	}
	 	int[] array2 = new int[unique];
 	 	int arrayCount = 0;
 	 	for(int x = 0; x < booleanArray.length; x++)
 	  	{
 	 		if(booleanArray[x])
 	 		{
 	 			array2[arrayCount] = array[x];
 	 			arrayCount++;		
 	 		}
	  	}
 	 	return array2;
	}
	/*
	 * Description: Building a multiplication table using 2 sets of arrays as the values
	 * Parameters: 2 arrays
	 * Returns: multidimensional array containing the products of each combination of elements from 2 different arrays
	 */
	public static int[][] productArray(int[]arr1, int[]arr2)
	{
		int[][] pArray = new int[arr1.length][arr2.length];
		
		for(int x = 0; x < arr1.length; x++)
		{
			for(int y = 0; y < arr2.length; y++)
			{
				pArray[x][y] = arr1[x] * arr2[y];
				/* Used to test array
				 * System.out.println("Array 1: " +arr1[x] + "\nArray 2: " +arr2[y] + "\npArray: " + pArray[x][y]);
				 */
			}
		}
		return pArray;
	}
	/*
	 * Description: Makes a pascal triangle with a certain number of rows
	 * Parameters: Number of rows the user wants the pascal triangle to have
	 * Return: A 2 dimensional array with n number of rows and the values inside that row in each corresponding array
	 */
	public static int[][] pascalTriangle(int n)
	{
		int[][] array1 = new int[n][]; //sets the 2-d array to n number of rows
		
		if(n == 1)
		{
			array1[0][0] = 1;
			//returns array
		}
		for(int i = 0; i < n; i++)
		{
			int[] innerArray = new int[i+1]; //determines how many values in each row
			innerArray[0] = 1;
			innerArray[innerArray.length - 1] = 1;
			
			if(i > 1)
			{
				for(int a = 1; a < innerArray.length-1; a++) //first and last term of array already set so it starts and ends on 2nd term/2nd to last term
				{
				innerArray[a] = array1[i-1][a] + array1[i-1][a-1];
				}
			}
			array1[i] = innerArray;
		}
		return array1;
		
	}
	/*
	 * Description: Prints a pascal triangle in the format of a triangle
	 * Parameters: One 2 dimensional array containing the number of rows and the corresponding numbers in each row
	 * Return: Prints out the pascal triangle with appropriate values for each row
	 */
	public static void printPascalTriangle(int [][] triangle)
	{
		//for(triangle[])
		for(int x = 0; x < triangle.length; x++)
		{
			//System.out.print(empty);
			//empty = empty.substring(0, empty.length()-2);
			for(int i = triangle.length; i > x; i--)
			{
				System.out.print("   ");
			}
			for(int y = 0; y < triangle[x].length; y++)
			{
				System.out.print("[ " +triangle[x][y]+ " ]");
			}
			System.out.println();
		}
	}
	
	/*
	 *Description: copyArray makes a copy of the array passed into the parameter
	 *Parameters: intArray 
	 *returns the copy of the parameter
	 */
	public static int[] copyArray(int[] intArray)
	{
		int[] copy = new int[intArray.length];
		
		for(int i = 0; i<intArray.length; i++)
		{
			copy[i] = intArray[i];
		}
		return copy;
	}
}