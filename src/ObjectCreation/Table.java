package ObjectCreation;

import java.util.ArrayList;

public class Table
	{
		static ArrayList<Player> table = new ArrayList<Player>();

		public static void addPlayersToTable(int numberOfPlayers)
			{
				for (int i = 0; i < numberOfPlayers; i++)
					{
						table.add(new Player("", 0, 0, "Standard"));
					}
				System.out.println(table.size());
			}
	
	}
