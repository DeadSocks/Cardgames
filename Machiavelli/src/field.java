import java.util.ArrayList;


public class field {
	private ArrayList<set> sets = new ArrayList<set>();
	
	
	public field()
	{
		
	}
	
	public void addSet(set setToAdd)
	{
		sets.add(setToAdd);
	}
	
	public ArrayList<card> cardsOnField()
	{
		ArrayList<card> cardsFromSets = new ArrayList<card>();
		for(set setsOnField : sets)
		{
			cardsFromSets.addAll(setsOnField.cardsInSet());
		}
		return cardsFromSets;
	}
	
	public void playCards()
	{
		
	}
	
	public boolean canSetsbeFormed(ArrayList<card> cards)//Given a bunch of cards, can we form valid sets from it?
	{
		
		
		
		return true;//CHECK ME
	}
	
	
}

