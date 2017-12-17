package Lab4One;

public class Decktester
{
	public static void main(String args[])
	{
		//test code for creating a king of spades
		System.out.println("<---------------------Test Code for creating a King of Spades through the Cards.java file--------------------->\n\n");
		Cards example = new Cards("King", "Spades", 13);
		System.out.println("This card" + example.toString() + "\n\n");
		
		//Test code for Deck
		String[] rank = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
		String[] suit = {"Diamonds", "Clubs", "Hearts", "Spade"};
		int[] pointValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		//Creates the deck of cards
		Deck deck = new Deck(rank, suit, pointValue);
		
		//Unshuffled deck of cards being printed out
		System.out.println("<---------------------Test Code for creating a deck of cards unshuffled--------------------->\n\n");
		for(int i = 0; i < deck.size(); i++)
		{
			System.out.println("Card " + (i+1) + deck.getCard(i).toString());
		}
		System.out.println("\n\n");
		
		//Shuffled deck of cards being printed out
		System.out.println("<---------------------Test Code for creating a deck of cards shuffled--------------------->\n\n");
		deck.shuffle();
		for(int i = 0; i < deck.size(); i++)
		{
			System.out.println("Card " + (i+1) + deck.getCard(i).toString());
		}
	}
}