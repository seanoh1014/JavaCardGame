public class Game {
    
    private Deck deck;
    private Player[] players;
    
    /**
     * The Game class constructor should initialize players array. The players 
     * array should be numPlayers in size. Loop through players and create 
     * Player objects and assign them to elements in the players array.
     */
    public Game(int numPlayers) {
        deck = new Deck();
        players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            Player player = new Player();
            players[i] = player;
        }

    }
    
    /**
     * In the playGame method, loop through the players array and deal 5 cards 
     * to each player. To deal each card, you will need to call the deck objects
     * dealCard method. You will need to use the addCard method to pass the card
     * to the player. After dealing the cards, loop through & print out the players.
     */
    public void playGame() {
        for (Player player : players) {
            for (int i = 0; i < 5; i++) {
                Card card = deck.dealCard();
                player.addCard(card);
            }
            System.out.println(player);
        }
    }
    

}
