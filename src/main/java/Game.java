import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game(ArrayList<Player> players, Deck deck){
        this.players = players;
        this.deck = deck;
    }

    public void dealCard(){
        for (Player player : players){
            Card card = deck.dealCard();
            player.addCard(card);
        }
    }

    public Player compareCards(){
        Player winner = players.get(0);
        for (Player player : players){
            Card winnerCard = winner.getCard().get(0);
            Card actualCard = player.getCard().get(0);
            if ( actualCard.getRankType().getValue() > winnerCard.getRankType().getValue()){
                winner = player;
            }
        }
        return winner;
    }

}
