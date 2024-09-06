import java.util.*;

public class Deck {

    private ArrayList<Card> deck;
    
    public Deck() {
        deck = new ArrayList<Card>();
        createDeck();
        shuffleDeck();
    }
    
    private void createDeck() {
        
        for (int i = 0; i < 52; i++) {
            Card card = new Card(i);
            deck.add(card);
        }
    }
    
    public void shuffleDeck() {
        
        for (int i = 0; i < 52; i++) {
            int random = (int) (Math.random() * deck.size());
            
            Card swap = deck.get(i);
            //deck.get(i) = deck.get(random);
            deck.set(i, deck.get(random));
            deck.set(random, swap);
        }
    }
    
    public void show() {
        
        for (int i = 0; i < 52; i++) {
            if (i != 0 && i % 13 == 0) {
                System.out.println();
            }
            System.out.print(deck.get(i) + " ");
        }
        System.out.println();
    }
    public Card dealCard() {
        return deck.remove(0);
    }
    
    public int getDeckSize() {
        return deck.size();
    }
}
