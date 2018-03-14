package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class DeckTest {

	@Test
	public void TestDeck() {
		Deck d=new Deck(1);
		Deck f=new Deck(6);

		assertEquals(d.deckLength(),52);
		assertEquals(f.deckLength(),312);

	}
	
	@Test
	public void TestgetRemaining() {
		Deck deck=new Deck(1);
		
		assertEquals(deck.getRemaining(eSuit.HEARTS),13);
	}

}
