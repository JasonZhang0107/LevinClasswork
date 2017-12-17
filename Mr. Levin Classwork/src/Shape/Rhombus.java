package Shape;

public class Rhombus implements Shape
{
	// fields
	private int diagonal1;
	private int diagonal2;
	private int side;

	/**
	 * Constructor method
	 * 
	 * @param base, height
	 */
	public Rhombus(int diagonal1, int diagonal2, int side)
	{
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
		this.side = side;
	}
	@Override
	public double calculateArea() 
	{
		// to be implemented by student
		return (diagonal1*diagonal2)/(2);
	}
	@Override
	public double calculatePerimeter() 
	{
		// to be implemented by student
		return (side*4);
	}
	@Override
	public String toString() 
	{
		// to be implemented by student
		return "Rhombus Diagonal 1: " + diagonal1 + " Rhombus Diagonal 2: " + diagonal2 + " Rhombus side: " + side + " Area: " + this.calculateArea() + " Perimeter: "
		+ this.calculatePerimeter();
	}
}