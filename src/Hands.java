import java.util.ArrayList;
import java.util.Collections;

public class Hands
	{
		static int anotherHand = 0;

		public static void royalFlush(ArrayList<Card> hand, String handName)
			{
				int heartsCounter = 0;
				int spadesCounter = 0;
				int diamondsCounter = 0;
				int clubsCounter = 0;
				GameProcesses.sortFullHandRank(hand);
				for (int i = 0; i < hand.size(); i++)
					{
						if (hand.get(i).getSuit().equals("Hearts"))
							{
								heartsCounter = heartsCounter++;
							}
						else if (hand.get(i).getSuit().equals("Spades"))
							{
								spadesCounter = spadesCounter++;
							}
						else if (hand.get(i).getSuit().equals("Diamonds"))
							{
								diamondsCounter = diamondsCounter++;
							}
						else
							{
								clubsCounter = clubsCounter++;
							}

					}
				

				for (int i = 0; i < hand.size() - 1; i++)
					{
						if (hand.get(i).getRank() == hand.get(i + 1).getRank())
							{
								hand.remove(i + 1);
							}
					}
				// System.out.println("hand size = " + hand.size());
				// GameProcesses.printFullHand(hand);

				if (((hand.get(0).getRank() == hand.get(1).getRank() + 1)
						&& (hand.get(0).getSuit().equals(hand.get(1).getSuit()))
						&& ((hand.get(1).getRank() == (hand.get(2).getRank()) + 1)
								&& (hand.get(1).getSuit().equals(hand.get(2).getSuit()))
								&& ((hand.get(2).getRank() == (hand.get(3).getRank()) + 1)
										&& (hand.get(2).getSuit().equals(hand.get(3).getSuit()))
										&& hand.get(3).getRank() == (hand.get(4).getRank()) + 1
										&& (hand.get(3).getSuit().equals(hand.get(4).getSuit()))))))
					{
						anotherHand++;
						System.out.println(handName + " got a ROYAL FLUSH!");
					}
				else
					{
						System.out.println(handName + " didn't get a ROYAL FLUSH!");
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
