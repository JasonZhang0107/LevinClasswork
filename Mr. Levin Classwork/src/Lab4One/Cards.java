package Lab4One;

public class Cards
{
	private String rank;
	private String suit;
	private int pointValue;

	public static void main(String args[] )
	{
		//test code for creating a king of spades
		/*
		Cards example = new Cards("King", "Spades", 13);
		System.out.println(example.toString());*/
		
		
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
	public boolean equals(Cards otherCard)
	{
		if((this.rank.equals(otherCard.rank)) && (this.suit.equals(otherCard.suit)) && (this.pointValue == otherCard.pointValue))
		{
			return true;
		}
		return false;
	}
	//return an appropriate string for this card
	public String toString()
	{
		String cardString = "This card has rank " +this.rank+ " with a suit of " +this.suit+ " and a point value of " +this.pointValue;
		
		return cardString;
	}
}
