import java.util.ArrayList;
import java.util.Arrays;


public class set {
	public ArrayList<card> cardsInSet = new ArrayList<card>();

	public set(card...cardInputs)//For an arbitrary number of cards, make a set
	{
		for(card cardToAdd : cardInputs)
		{
			cardsInSet.add(cardToAdd);
		}
	}
	
	public void addCardToSet(card cardToAdd)//Adds a card to the set.
	{
		this.cardsInSet.add(cardToAdd);
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
	
	public boolean checkNumsSame()//Assuming different suits, are they the same number and unique cards?
	{
		int num = this.cardsInSet.get(0).getValue();//Get the number of the first card in the set
		for(card cardsToCheck:this.cardsInSet)//For all cards in the set we're verifying
		{
			if(cardsToCheck.getValue() != num)
					return false;//They aren't all the same number
			}
		return true;
	}
	
	public boolean checkNumsInSequence()//Checks if the numbers are a continuous sequence
	{
		int[] placements; 
		placements = new int[this.cardsInSet.size()];
		
		for(int i = 0; i<this.cardsInSet.size();i++)//card cardsToCheck : this.cardsInSet
		{
			placements[i] = this.cardsInSet.get(i).getValue();
		}
		Arrays.sort(placements);
		
		for(int i = 1; i < placements.length; i++)
		{
			if(placements[i] - placements[i-1] != 1)
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean isValidAllSameSuitSeqNumsSet()
	{		
		if(this.checkSuitSame())//If all the cards are of the same suit
		{
			if(this.checkNumsInSequence())//If all the cards, which are of the same suit, are of a continuous sequence of numbers
			{
				return true;
			}
			else return false;
		}
		else return false;
	}
	
	public boolean isValidAllSameNumDiffSuitSet()
	{
		if(this.checkNumsSame())//If all the cards are of the same number
		{
			if(this.checkSuitAllDiff())//If all the cards are of different suits
			{
				return true;
			}
			else return false;
		}
		else return false;
	}
	
	public boolean isValid()//
	{
		if(this.isValidAllSameSuitSeqNumsSet() || this.isValidAllSameSuitSeqNumsSet())
		{
			return true;
		}
		return false;
	}
	
	public ArrayList<card> cardsInSet()
	{
		return cardsInSet();
	}
}
