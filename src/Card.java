

public class Card
	{
		private String value;
		private String suit;
		private int rank;

		public Card(String value, String suit, int rank)
			{
				this.value = value;
				this.suit = suit;
				this.rank = rank;
			}

		public String getValue()
			{
				return value;
			}

		public void setValue(String value)
			{
				this.value = value;
			}

		public String getSuit()
			{
				return suit;
			}

		public void setSuit(String suit)
			{
				this.suit = suit;
			}

		public int getrank()
			{
				return rank;
			}

		public void setrank(int rank)
			{
				this.rank = rank;
			}

	}
