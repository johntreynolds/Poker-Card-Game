import java.util.ArrayList;

import ObjectCreation.Card;

public class Hands
	{
		public static int royalFlush(ArrayList<Card> deck)
			{
				return 1;
			}

		public static int straightFlush(ArrayList<Card> deck)
			{
				return 2;
			}

		public static int fourOfAKind(ArrayList<Card> deck)
			{
				return 3;
			}

		public static int fullHouse(ArrayList<Card> deck)
			{
				return 4;
			}

		public static int flush(ArrayList<Card> deck)
			{
				return 5;
			}

		public static int straight(ArrayList<Card> deck)
			{
				return 6;
			}

		public static int threeOfAKind(ArrayList<Card> deck)
			{
				return 7;
			}

		public static int twoPair(ArrayList<Card> deck)
			{
				return 8;
			}
		
		public static int onePair(ArrayList<Card> deck)
			{
				return 9;
			}
		
		public static int highCard(ArrayList<Card> deck)
			{
				return 10;
			}
	}
