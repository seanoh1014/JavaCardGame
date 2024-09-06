import java.util.*;

public class Player {

    private static int totalPlayers = 0;
    private int playerNum, handValue;
    private ArrayList<Card> hand;
    
    
    public Player() {
        playerNum = totalPlayers++;
        handValue = 0;
        hand = new ArrayList<Card>();
        
        
    }
    
    public void addCard(Card card) {
        hand.add(card);
        handValue += card.getValue();
    }
    
    public int getHandValue() {
        return handValue;
    }
    
    public String toString() {
        String playerName;
        
        if (playerNum == 0) {
            playerName = "Dealer  ";
        }
        else {
            playerName = "Player " + playerNum;
        }
        
        return playerName + ": " + handValue + " " + hand;
    }
    
    
}
