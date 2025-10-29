
public class Card
	{
		private String value;
		private String suit;
		private int number;

		public Card(String value, String suit, int number)
			{
				this.value = value;
				this.suit = suit;
				this.number = number;
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

		public int getNumber()
			{
				return number;
			}

		public void setNumber(int number)
			{
				this.number = number;
			}

	}
