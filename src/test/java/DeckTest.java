import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private SuitType suitType;
    private RankType rankType;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.numberOfCards());
    }

    @Test
    public void deckHas52Cards() {
        deck.populateDeck(suitType, rankType);
        assertEquals(52, deck.numberOfCards());
    }

//    @Test
//    public void compareDeck() {
//        deck.populateDeck(suitType, rankType);
//        ArrayList<Card> originalDeck = deck.getCards();
//        deck.shuffleCards();
//        ArrayList<Card> shuffledDeck = deck.getCards();
//
//    }

    @Test
    public void testDealCard(){
        deck.populateDeck(suitType, rankType);
        deck.shuffleCards();
        deck.dealCard();
        assertEquals(51, deck.numberOfCards());
    }

}


