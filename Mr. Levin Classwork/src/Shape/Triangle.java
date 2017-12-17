package Shape;

public class Triangle implements Shape
{
	// fields
	private int base;
	private int height;

	/**
	 * Constructor method
	 * 
	 * @param base, height
	 */
	public Triangle(int base, int height)
	{
		this.base = base;
		this.height = height;
	}
	@Override
	public double calculateArea() 
	{
		// to be implemented by student
		return (base*height)/(2);
	}
	@Override
	public double calculatePerimeter() 
	{
		// to be implemented by student
		return (base*3);
	}
	@Override
	public String toString() 
	{
		// to be implemented by student
		return "Triangle Base: " + base + " Triangle Height: " + height + " Area: " + this.calculateArea() + " Perimeter: "
		+ this.calculatePerimeter();
	}
}
