package Lab4One;

import java.util.*;

public class Deck
{	
	private ArrayList<Cards> unDealt;
	private ArrayList<Cards> Dealt;
	
	//Creates 1 card for each element in suit and assigns it the respective values from arrays rank and pointValue
	public Deck(String[] rank, String[] suit, int[] pointValue)
	{
		ArrayList<Cards> unDealt = new ArrayList<Cards>();
		for(int i=0; i<suit.length; i++)
		{
			for(int j = 0; j<rank.length; j++)
			{
				Cards card = new Cards(rank[j], suit[i], pointValue[j]);
				unDealt.add(card);
			}
		}
		this.unDealt = unDealt;
		this.Dealt = new ArrayList<Cards>();
	}
	/*
	 * Description: check if deck is empty
	 * Return: true if unDealt deck is empty, false otherwise
	 */
	public boolean isEmpty()
	{
		if(unDealt.size() == 0)
		{
			return true;
		}
		return false;
	}
	/*
	 * Description: checks the size of the unDealt deck
	 * Return: size of the unDealt deck
	 */
	public int size()
	{
		return unDealt.size();
	}
	/*
	 * Description: Deals a card
	 * Return: returns the card that is dealt
	 * Side Effect: card is removed from unDealt and added to Dealt
	 */
	public Cards deal()
	{
		if(unDealt.size() == 0)
		{
			return null;
		}
		else
		{
			Cards card = unDealt.get(0);
			unDealt.remove(0);
			Dealt.add(card);
			
			return card;
		}
	}
	/*
	 * Description: shuffles all the cards from Dealt back into unDealt and then shuffles unDealt
	 * Side effect: empties Dealt into unDealt until it has 0 cards and shuffles unDealt
	 */
	public void shuffle()
	{
		//deals all the cards from dealt back into unDealt
		for(int k = Dealt.size()-1; k > 0; k--)
		{
			Cards card = Dealt.get(k);
			
			Dealt.remove(k);
			unDealt.add(card);
		}
		//shuffles unDealt
		for(int j = 51; j > 1; j--)
		{
			int r = (int) (Math.random()*11);
			Cards cardj = unDealt.get(j);
			Cards cardr = unDealt.get(r);
			
			unDealt.set(j, cardr);
			unDealt.set(r, cardj);
		}
	}
	/*
	 * Description: Returns the card from unDealt at index i
	 */
	public Cards getCard(int i)
	{
		Cards card = unDealt.get(i);
		
		return card;
	}
}
