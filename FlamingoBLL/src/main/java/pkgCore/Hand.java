package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		
	}
	
	public int[] ScoreHand()
	{
		int [] iScore = new int[2];
		
		iScore[0] = 0;
		iScore[1] = 0;
		
		Collections.sort(cards);
		
		
		for (Card c: cards)
		{
			if( c.geteRank() == eRank.ACE ) {
				iScore[0] = iScore[1];
			}
			
			iScore[0]+=c.getValue()[0];
			iScore[1]+=c.getValue()[1];
			
			if( c.geteRank() == eRank.ACE && iScore[0] > 21 ) {
				iScore[0] = iScore[1];
			}
		}
		
		return iScore;
	}
	
	public void Draw(Deck d)
	{
		AddCard(d.draw());
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
}