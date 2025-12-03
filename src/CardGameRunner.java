import ObjectCreation.Deck;
import ObjectCreation.Table;

public class CardGameRunner
	{

		public static void main(String[] args)
			{
				GameProcesses.gameRules();
				Table.addPlayersToTable(4);

				Deck.fillDeck();
				Deck.shuffle();

				GameProcesses.dealCards4Player();
				GameProcesses.printPlayerCards();

			}

	}
