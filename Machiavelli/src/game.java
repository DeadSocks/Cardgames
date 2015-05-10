import java.util.ArrayList;

public class game {
	
	private static int numberOfPlayers = 2;
	private static ArrayList<player> playersInGame = new ArrayList<player>();
	
	public static void main(String[] args) {
		
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
		
		
		
	}
}
