package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {
			
	private eRank _eRank;
	private eSuit _eSuit;
	
	public Card(eSuit eSuit,eRank eRank) {
		this.seteRank(eRank);
		this.seteSuit(eSuit);
	}
	
	public int[] getValue() {
		switch(geteRank()) {
			case TWO:
			return new int[] {2,2};
			case THREE:
			return new int[] {3,3};
			case FOUR:
			return new int[] {4,4};
			case FIVE:
			return new int[] {5,5};
			case SIX:
			return new int[] {6,6};
			case SEVEN:
			return new int[] {7,7};
			case EIGHT:
			return new int[] {8,8};
			case NINE:
			return new int[] {9,9};
			case TEN:
			return new int[] {10,10};
			case JACK:
			return new int[] {10,10};
			case QUEEN:
			return new int[] {10,10};
			case KING:
			return new int[] {10,10};
			case ACE:
			return new int[] {11,1};

		}
		return new int[] {0};
			
	}
	
	private void seteRank(eRank eRank) {
		this._eRank = eRank;
	}


	private void seteSuit(eSuit eSuit) {
		this._eSuit = eSuit;
	}


	public eRank geteRank() {
		return _eRank;
	}


	public eSuit geteSuit() {
		return _eSuit;
	}	
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return 0;
		//return c.geteRank().compareTo(this.geteRank());

}
	
}