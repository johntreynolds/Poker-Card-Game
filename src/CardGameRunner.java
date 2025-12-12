import java.util.ArrayList;

public class CardGameRunner
	{

		public static void main(String[] args)
			{
				// GameProcesses.gameRules();
				GameProcesses.fuckassGameRules();
				System.out.println(""); // Space

				Deck.fillDeck();
				Deck.shuffle();

				GameProcesses.dealCards4Player();
				GameProcesses.printPlayerCards();
				System.out.println(""); // Space
				speedrunCommunityCards();
				System.out.println(""); // Space
				GameProcesses.combineHandsAndCommunity();
				// GameProcesses.printFullHand();
				testCheckingHands(Deck.player1, "Player 1");
				//player1
				//royalFlush
				//testRoyalFlushDuplicates

			}

		public static void speedrunCommunityCards()
			{
				GameProcesses.flop();
				// System.out.println(""); // Space
				GameProcesses.turn();
				// System.out.println(""); // Space
				GameProcesses.river();
			}

		public static void testCheckingHands(ArrayList<Card> hand, String handName)
			{
				Deck.fillRoyalFlush();
				Deck.fillTestRoyalFlushDuplicates();
				GameProcesses.checkHand(hand, "Player 1");
			}
	}
