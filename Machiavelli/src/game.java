import java.util.ArrayList;

public class game {
	
	private static int numberOfPlayers = 2;
	private static ArrayList<player> playersInGame = new ArrayList<player>();
	private deck myDeck;
	
	public static boolean isGameOver()
	{//////////////////////////////////
		for(int i=0;i < numberOfPlayers;i++)//checks if game is over.
		{
			if(playersInGame.get(i).numCards() == 0)
			{
				return true;
			}
		}
		return false;
	}
	
	public void setupDeck()
	{
		this.myDeck.generateDeck();
		deck.shuffleDeck();
	}
	public void deckSetup()
	{
		
	}
	
	public static void main(String[] args) {
		deck myDeck = new deck();
		myDeck.generateDeck();
		deck.shuffleDeck();
		
		for(int i=0; i<numberOfPlayers; i++)
		{
			player myNewPlayer = new player(i, Integer.toString(i));
			playersInGame.add(myNewPlayer);
		}	
		
		for(int i=0; i<13*numberOfPlayers; i++)
		{
			playersInGame.get(i%numberOfPlayers).drawCard(myDeck);
		}

		while(!isGameOver())//While the game is not over
		{
			for(int i = 0; i<numberOfPlayers; i++)
			{
				if(!isGameOver())//There fucking has got to be a better way than this
				{
					
				}
			}
		}
			
		
		
		////////////////////////////////
		///////Testing area/////////////
		////////////////////////////////
		//card newCard = new card(2,1);
		//card newCardTwo = new card(6,1);
		//card newCardThree = new card(3,1);
		//set newSet = new set(newCard, newCardTwo, newCardThree);
		//System.out.println(newSet.printSet());
		//System.out.println(newSet.isValid());
		
		for(int i = 0; i < numberOfPlayers; i++)
		{
			System.out.println(playersInGame.get(i).cardsInHand().isValid());
		}
		
		
	}
}
