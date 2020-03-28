import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.hand = new ArrayList<Card>();
        this.name = name;
    }

    public void addCard(Card card){
        this.hand.add(card);
    }

    public ArrayList<Card> getCard(){
        return this.hand;
    }
}
