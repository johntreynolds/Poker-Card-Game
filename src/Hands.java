import java.util.ArrayList;
import java.util.Collections;

public class Hands
	{
		public static int royalFlush(ArrayList<Card> hand)
			{
				Collections.sort(hand, new SuitSorting());
				Collections.sort(hand, new RankSorting());
				boolean hasRoyalFlush = 
						hand.get(0).getrank() == 14 && 
						hand.get(1).getrank() == 13 && 
						hand.get(2).getrank() == 12 && 
						hand.get(3).getrank() == 11 && 
						hand.get(4).getrank() == 10;
				if (hasRoyalFlush == false)
					{
						return -1;
					}
				else
					{
						return 1;
					}
				
				
			}

		public static void straightFlush()
			{
				
			}

		public static void fourOfAKind()
			{
				
			}

		public static void fullHouse()
			{
				
			}

		public static void flush()
			{
				
			}

		public static void straight()
			{
				
			}

		public static void threeOfAKind()
			{
			
			}

		public static void twoPair()
			{
				
			}
		
		public static void onePair()
			{
				
			}
		
		public static void highCard()
			{
				
			}
	}
