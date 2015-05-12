import java.util.ArrayList;


public class set {
	public ArrayList<card> cardsInSet = new ArrayList<card>();

	public set(card...cardInputs)//For an arbitrary number of cards, make a set
	{
		for(card cardToAdd : cardInputs)
		{
			cardsInSet.add(cardToAdd);
		}
	}
	
	public String printSet()
	{
		String returner= "Cards in set: \n";
		for(int i = 0; i < cardsInSet.size(); i++)
		{
			returner = returner.concat(cardsInSet.get(i).cardString());
			returner = returner.concat("\n");
		}
		return returner;
	}

	public boolean checkSuitSame()//Are they all of the same suit?
	{
		int suit = this.cardsInSet.get(0).getSuit();
		for(card cardsToCheck : this.cardsInSet)
		{
			if(cardsToCheck.getSuit() != suit)
			{
				return false;
			}
		}
		return true;
	}
	
	
	public boolean checkSuitAllDiff()//Are they all of different suits?
	{
		int[] suitNums;
		suitNums = new int[4];
		
		for(card cardsToCheck : this.cardsInSet)
		{
			suitNums[cardsToCheck.getSuit()]++;
		}
		for(int suitCounts : suitNums)
		{
			if(suitCounts > 1)
				return false;
		}
		return true;
	}
	
	
	public boolean checkNumsSameAndUnique()//Assuming different suits, are they the same number and unique cards?
	{
		int num = this.cardsInSet.get(0).getValue();
		int[] numCounts;
		numCounts = new int[13];
		
		for(card cardsToCheck:this.cardsInSet)
		{
			if(cardsToCheck.getValue() != num)
					return false;//They aren't all the same number
			
			numCounts[cardsToCheck.getValue()+1]++;
		}
		//So, now we know they're all the same number. Are they unique?
		for(int numCnts : numCounts)
		{
			if (numCnts != 0 && numCnts != this.cardsInSet.size())
				return false;
		}
		return true;
	}
	
	public void sortSet()
	{
		final ArrayList<card> orderedCards = new ArrayList<card>();
		int[] placements;
		placements = new int[this.cardsInSet.size()];
		
		for(int i = 0; i<this.cardsInSet.size();i++)//card cardsToCheck : this.cardsInSet
		{
			placements[i] = this.cardsInSet.get(i).getValue();
		}
		
		this.cardsInSet = orderedCards;//Set the set's internal card list equal to the numerically ordered card list
	}
	
	public boolean isValid()//Set verification, how do we do? Which class?
	{
		if(this.checkSuitAllDiff() == true){//If they are all of a different suit
			if(this.checkNumsSameAndUnique())//If all the numbers are the same and each card is also unique
			{
				return true;
			}
			else
				{return false;}
		}
		
		//this.checkSuitSame() == false && 
		
		final ArrayList<card> cardsToCheckAgainst = new ArrayList<card>();
		for(card cardsToCheck : this.cardsInSet)
		{
			
		}
	}
	

}
