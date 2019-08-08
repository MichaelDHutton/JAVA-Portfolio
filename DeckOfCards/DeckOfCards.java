/**
 * 
 */

/**
 * @author Michael Hutton
 *
 */

import java.security.SecureRandom;
 
public class DeckOfCards {
	private static final SecureRandom ramdomNumbers = new SecureRandom();
	private static final int NUMBER_OF_CARDS = 52;
	
	private Card[] deck = new Card[NUMBER_OF_CARDS];
	private int currentCard = 0;
	
	public DeckOfCards() {
	String[] faces = {"Ace", "Duece", "Three", "Four", "Five", "Six", "Seven",
			"Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	
	for (int count = 0; count < deck.length; count++) 
		{
		deck[count] =
				new Card(faces[count % 13], suits[count / 13]);
		}
	} 
	public void shuffle () 
	{
		currentCard = 0;
		
		for (int first = 0; first < deck.length; first++) 
		{
			int second = ramdomNumbers.nextInt(NUMBER_OF_CARDS);
			
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	
	public Card dealCard() 
		{
		if (currentCard < deck.length) 
		{
			return deck[currentCard++];
		}
		else 
			{
			return null;
			}
		}
	}
	
	
	
