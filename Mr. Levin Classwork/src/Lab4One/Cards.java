package Lab4One;

public class Cards
{
	private String rank;
	private String suit;
	private int pointValue;

	public static void main(String args[] )
	{
		
	}
	//constructor
	public Cards(String rank, String suit, int pointValue)
	{
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	//getter methods for all 3 fields
	public String rank()
	{
		return rank;
	}
	public String suit()
	{
		return suit;
	}
	public int pointValue()
	{
		return pointValue;
	}
	//Check if this card equals another in value
	public boolean equals(Card otherCard)
	{
		
	}
	//return an appropriate string for this card
	public String toString()
	{
		
	}
}
