


public class Player
	{
		private String name;
		private int dollarAmount;
		private int handValue;
		private String position;

		public Player(String name, int dollarAmount, int handValue, String position)
			{
				this.name = name;
				this.dollarAmount = dollarAmount;
				this.handValue = handValue;
				this.position = position;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getDollarAmount()
			{
				return dollarAmount;
			}

		public void setDollarAmount(int dollarAmount)
			{
				this.dollarAmount = dollarAmount;
			}

		public int getHandValue()
			{
				return handValue;
			}

		public void setHandValue(int handValue)
			{
				this.handValue = handValue;
			}

		public String getPosition()
			{
				return position;
			}

		public void setPosition(String position)
			{
				this.position = position;
			}
		
		
	}
