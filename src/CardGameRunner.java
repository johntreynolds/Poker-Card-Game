import ObjectCreation.Deck;

public class CardGameRunner
	{

		public static void main(String[] args)
			{
				//GameProcesses.gameRules();
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

			}

		public static void speedrunCommunityCards()
			{
				GameProcesses.flop();
				System.out.println(""); // Space
				GameProcesses.turn();
				System.out.println(""); // Space
				GameProcesses.river();
			}

	}
