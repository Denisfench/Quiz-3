package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	private ArrayList<Card> cardsInDeck;

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
	}

	public Card Draw() {

		return cardsInDeck.remove(0);

	}
	public class Remaining {

		public int getRemaining(Object obj) {
			int n = 0;
			
			
			if (obj instanceof eRank) {
				for (Card c: DeckCards) {
					if (c.geteRank == (eRank) obj) {
						n++;
					}
				}
				
			
			
			if (obj instanceof eSuit) {
				for (Card c: DeckCards) {
					if (c.geteSuit == (eSuit) obj) {
						n++;
					}
				}
			}
				
				
			}
			
		}
	}

}
