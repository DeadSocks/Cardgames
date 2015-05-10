public class card {

    public final static int SPADES = 0,       // Codes for the 4 suits.
                            HEARTS = 1,
                            DIAMONDS = 2,
                            CLUBS = 3;
                            
    public final static int ACE = 1,          // Codes for the non-numeric cards.
                            JACK = 11,        //   Cards 2 through 10 have their 
                            QUEEN = 12,       //   numerical values for their codes.
                            KING = 13;
                            
    private final int suit;   // The suit of this card, one of the constants
                              //    SPADES, HEARTS, DIAMONDS, CLUBS.
                              
    private final int value;  // The value of this card, from 1 to 11.
                             
    public card(int theValue, int theSuit) {
        value = theValue;
        suit = theSuit;
    }
        
    public int getSuit() {
        return suit;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getSuitAsString() {
        switch ( suit ) {
           case SPADES:   return "Spades";
           case HEARTS:   return "Hearts";
           case DIAMONDS: return "Diamonds";
           case CLUBS:    return "Clubs";
           default:       return "??";
        }
    }
    
    public String getValueAsString() {
        switch ( value ) {
           case 1:   return "Ace";
           case 2:   return "2";
           case 3:   return "3";
           case 4:   return "4";
           case 5:   return "5";
           case 6:   return "6";
           case 7:   return "7";
           case 8:   return "8";
           case 9:   return "9";
           case 10:  return "10";
           case 11:  return "Jack";
           case 12:  return "Queen";
           case 13:  return "King";
           default:  return "??";
        }
    }
    
    public String cardString() {
        return getValueAsString() + " of " + getSuitAsString();
    }
    
    public Boolean isEqual(card otherCard){
    	boolean result = true;
    	if (this.getClass() != otherCard.getClass())
    	{
    		result = false;
    	}
    	else if (this.value != otherCard.value || this.suit != otherCard.suit)
    	{
    		result = false;
    	}
    	return result;
    }
}