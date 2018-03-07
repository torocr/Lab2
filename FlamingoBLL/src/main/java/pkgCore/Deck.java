package pkgCore;
import java.util.ArrayList;
import java.util.Random;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	private ArrayList<Card> deck;
	public Deck(int numberOfDecks){
		deck=new ArrayList<Card>();
		for(int i=0;i<numberOfDecks;i++) {
			for(eSuit eSuit: eSuit.values()) {
				for(eRank eRank:eRank.values()) {
					deck.add(new Card(eSuit,eRank)); //creates a deck of 52 cards
				}
			}
		}
	}
	public int deckLength() {
		return deck.size();
	}

	public Card draw() {
		Random random=new Random();
		int cardNumber=random.nextInt(deck.size()-1);
		return deck.remove(cardNumber);
	}
}