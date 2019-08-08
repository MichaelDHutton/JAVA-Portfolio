
public class DeckOfCardsRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DeckOfCards myDeckOfCards = new DeckOfCards();
			myDeckOfCards.shuffle();
			
			for (int i = 1; i <= 52; i++) 
			{
				System.out.printf("%-19s", myDeckOfCards.dealCard());
				
				if (i % 4 == 0) 
				{
					System.out.println();
			}
		}
	}

}
