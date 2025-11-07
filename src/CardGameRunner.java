import ObjectCreation.Table;

public class CardGameRunner
	{

		
		
		public static void main(String[] args)
			{
				GameProcesses.gameRules();
				Table.addPlayersToTable(GameProcesses.numberOfPlayers());
				

			}

	}
