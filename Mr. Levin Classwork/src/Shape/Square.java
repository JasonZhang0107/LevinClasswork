package Shape;

public class Square extends Rectangle
{
	int side;

	public Square(int side) {
		super(side, side);
		this.side = side;
	}
	@Override
	public double calculateArea() 
	{
		// to be implemented by student
		return (side*side);
	}
	@Override
	public double calculatePerimeter() 
	{
		// to be implemented by student
		return (side*4);
	}

	@Override
	public String toString() {
		// To be written by student
		return "Square Side: " + side + " Area: " + this.calculateArea() + " Perimeter: "
		+ this.calculatePerimeter();
	}
}