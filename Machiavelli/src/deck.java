import java.util.ArrayList;
import java.util.Collections;

public class deck {
	private static final int decksInPlay = 2;
	private static ArrayList<card> deck = new ArrayList<card>();

	public void generateDeck()
	{
		for(int deckNumber = 0; deckNumber< decksInPlay; deckNumber++)
		{
			for(int i = 0; i<4; i++)//Iterate through suits
			{
				for(int j=1; j<14; j++)//Iterate through card numbers
				{
					card myNewCard = new card(j, i);
					deck.add(myNewCard);
				}
			}
		}
	}
	
	public static void addCardToDeck(card cardToAdd, int position)//Why is this a function?
	{
		deck.add(cardToAdd);
	}
	
	public static int getCardsRemaining()
	{
		return deck.size();
	}
	
	public static String numCardsInDeck()
	{
		return ("This deck has " + deck.size() + " cards in it.");
	}
	
	public static card drawCard()
	{
		card cardToBeDrawn = deck.get(0);
		deck.remove(0);
		//System.out.println(cardToBeDrawn.cardString());
		return cardToBeDrawn;
	}
	
	public static String cardsInDeck()
	{
		String returner = "The cards in this deck are as follows: \n";
		for(int i = 1; i <= deck.size(); i++)
		{
			returner = returner.concat("C" + i + ": ");
			returner = returner.concat(deck.get(i-1).cardString() + "\n");
		}
		return returner;
	}
	
	public static void shuffleDeck()
	{
		Collections.shuffle(deck);
	}
}
