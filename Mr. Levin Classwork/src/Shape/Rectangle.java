package Shape;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Rectangle implements Shape
{
	private int length;
	private int width;

	public Rectangle(int length, int width) 
	{
		this.length = length;
		this.width = width;
	}
	public double calculateArea() 
	{
		// To be written by student
		return (length*width);
	}


	public double calculatePerimeter() 
	{
		// To be written by student
		return (length*2)+(width*2);
	}


	public String toString() {
		return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}