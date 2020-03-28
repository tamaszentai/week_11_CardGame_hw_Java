import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game highestCard;
    private Player player1;
    private Player player2;
    private ArrayList<Player> players;
    private Deck deck;
    private RankType rankType;
    private SuitType suitType;

    @Before
    public void before(){
        this.deck = new Deck();
        this.player1 = new Player("Balazs");
        this.player2 = new Player("Tamas");
        this.players = new ArrayList<Player>();
        this.players.add(player1);
        this.players.add(player2);
        deck.populateDeck(suitType, rankType);
        deck.shuffleCards();
        this.highestCard = new Game(players, deck);
    }

    @Test
    public void checkDealCards(){
        highestCard.dealCard();
        assertEquals(1, player1.getCard().size());
        assertEquals(1, player2.getCard().size());
        assertEquals(50, deck.numberOfCards());
    }

    @Test
    public void decideWinner(){
        Card card1 = new Card(RankType.SIX, SuitType.CLUBS);
        Card card2 = new Card(RankType.FIVE, SuitType.HEARTS);
        Deck deck = new Deck();
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        player1.addCard(card1);
        player2.addCard(card2);
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        Game game = new Game(players, deck);
        assertEquals(player1, game.compareCards());
    }


}
