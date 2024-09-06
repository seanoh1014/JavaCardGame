public class Card implements Comparable<Card> {

    private int value;   
    private String face;
    private String suit;
    private String symbol;

    public Card(int n) {
        String[] faces   = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits   = {"S", "C", "H", "D"};
        String[] symbols = {"\u2660", "\u2663", "\u2665", "\u2666"};

        value  = n % 13 + 1;
        face   = faces[n % 13];
        suit   = suits[n / 13 % 4];
        symbol = symbols[n / 13 % 4];
        
        // Change the value of a J, Q, K to 10
        if (face.equals("J") || face.equals("Q") || face.equals("K")) {
            value = 10;
        }
        // Change the value of an A to 11
        if (face.equals("A")) {
            value = 11;
        }
    }
    
    /**
     * The compareTo method should return a negative integer, zero, or a 
     * positive integer if this Card is less than, equal to, or greater than 
     * the other Card. The order of the cards should be 2, 3, 4, 5, 6, 7, 8, 9, 
     * 10, J, Q, K, A. You should compare the cards values except when both 
     * values are 10. You will then need to compare the cards faces when their 
     * values are both 10. Here are some examples;
     */
    public int compareTo(Card other) {
        // get value of cards
        int firstValue = value;
        int secondValue = other.getValue();
        
        // get suit of cards
        String firstSuit = suit;
        String secondSuit = other.getSuit();
        
        
        
        
        // if both values are 10 compare the faces
        if (value == 10 && other.getValue() == 10) {
            return firstSuit.compareTo(secondSuit);
        }
        // if both faces are not 10, compare the values
        else {
            return secondValue - firstValue;
        }
        

    }    
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int newValue) {
        value = newValue;
    }
    
    public String getSuit() {
        return suit;
    }
    
    public String toString() {
        String result = face + symbol;
        if (result.length() == 2){
            result = " " + result;
        }
        
        if (suit.equals("H") || suit.equals("D")) {
            return "\u001B[31m" + result + "\u001B[0m";
        } else {
            return result;
        }
    }
}
