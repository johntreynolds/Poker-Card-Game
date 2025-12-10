import java.util.Comparator;

public class RankSorting implements Comparator<Card>
	{

		public int compare (Card c1, Card c2)
			{
				if (c1.getrank() < c2.getrank())
					{
						return 1;
					}
				else
					{
						return -1;
					}
				
			}

	}
