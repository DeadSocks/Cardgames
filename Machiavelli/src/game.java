import java.util.ArrayList;

public class game {
	
	private static int numberOfPlayers = 2;
	private static ArrayList<player> playersInGame = new ArrayList<player>();
	private static boolean gameOver = false;
	
	public static boolean isGameOver()
	{//////////////////////////////////
		return false;////This is where we are.
	}//////////////////////////////////
	
	public static void main(String[] args) {
		
		////////////////////////////////////////
		////Setting up initial stuff.
		////////////////////////////////////////
		
		//Generating deck for game.
		deck myDeck = new deck();
		myDeck.generateDeck();
		
		//Shuffling the deck.
		deck.shuffleDeck();
		
		//Generating players for game.
		for(int i=0; i<numberOfPlayers; i++)
		{
			player myNewPlayer = new player(i, Integer.toString(i));
			playersInGame.add(myNewPlayer);
		}	
		
		//Drawing initial cards, we draw 13 in this game...
		for(int i=0; i<13*numberOfPlayers; i++)
		{
			playersInGame.get(i%numberOfPlayers).drawCard(myDeck);
		}
		
		//They all say their hands for some reason! Yay!
		System.out.println(playersInGame.get(0).cardsInHand());
		System.out.println(playersInGame.get(1).cardsInHand());
		
		
		
		///////////////////////////////////////
		////////And now the game begins////////
		///////////////////////////////////////
		while(!gameOver)//While the game is not over
		{
			
			
			
			
			
			
			
			
			
			
			
			
			for(int i=0;i < numberOfPlayers;i++)//checks if game is over.
			{
				if(playersInGame.get(i).numCards() == 0)
				{
					gameOver = true;
				}
			}
		}
			

		
		
		
	}
}
