package Lab4One;

import java.util.*;

public class Deck
{
	private String[] rank;
	private String[] suit;
	private int[] pointValue;
	
	public Deck(String[] rank, String[] suit, int[] pointValue)
	{
		for(int i=0; i<suit.length; i++)
		{
			Cards card = new Cards(rank[i], suit[i], pointValue[i]);
		}
	}
	
}
