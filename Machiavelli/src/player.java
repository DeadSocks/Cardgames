import java.util.ArrayList;

public class player {
	private ArrayList<card> cardsInHand=new ArrayList<card>();
	private final int playerNumber;
	private static String playerName;
	
	public player(int playerNum, String name)
	{
		playerNumber = playerNum;
		playerName = name;
	}
	
	public int playerNumber()
	{
		return this.playerNumber();
	}
	
	public String playerName()
	{
		return playerName;
	}

	public void renamePlayer(String newName)
	{
		player.playerName=newName;
	}
	
	public void drawCard(deck DeckToDrawFrom)
	{
		cardsInHand.add(deck.drawCard());
	}
	
	public void sayCardsInHand()
	{
		String returner = "Player " + this.playerNumber + " has " + cardsInHand.size() + " card(s).\n";
		for(int i = 0; i < cardsInHand.size(); i++)
		{
			returner = returner.concat("C" + i + ": ");
			returner = returner.concat(cardsInHand.get(i).cardString() + "\n");
		}
		System.out.println(returner);
	}
	
	public int numCards()
	{
		return cardsInHand.size();
	}
	
	public set cardsInHand()//Returns a set that is of all cards in hand.
	{
		set returnerSet = new set();
		for (card cardToReturn : cardsInHand)
		{
			returnerSet.addCardToSet(cardToReturn);
		}
		return returnerSet;
	}
}
