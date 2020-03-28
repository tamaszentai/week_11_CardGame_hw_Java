import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    };

    public int numberOfCards() {
        return cards.size();
    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }

    public void populateDeck(SuitType suitType, RankType rankType) {
        SuitType[] suits = SuitType.values();
        RankType[] ranks = RankType.values();
        for (SuitType suit : suits) {
            for (RankType rank : ranks) {
                Card card = new Card(rank, suit);
                   this.cards.add(card) ;
            }
        }
    }

    public void shuffleCards(){
       Collections.shuffle(cards);
    }

    public Card dealCard() {
        return this.cards.remove(0);
    }
}
