import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GameProcesses
	{

		// Psuedo Code

		// INTRO

		// Game Process
		public static void gameRules()
			{

				System.out.println("CASINO POKER RULESET");
				System.out.println("====================");
				System.out.println();

				System.out.println("1. Objective");
				System.out.println("   - Form the best 5-card poker hand or win by making all opponents fold.");
				System.out.println();

				System.out.println("2. Hand Rankings (Highest to Lowest)");
				System.out.println("   1) Royal Flush");
				System.out.println("   2) Straight Flush");
				System.out.println("   3) Four of a Kind");
				System.out.println("   4) Full House");
				System.out.println("   5) Flush");
				System.out.println("   6) Straight");
				System.out.println("   7) Three of a Kind");
				System.out.println("   8) Two Pair");
				System.out.println("   9) One Pair");
				System.out.println("   10) High Card");
				System.out.println();

				System.out.println("3. Game Elements");
				System.out.println("   - Standard 52-card deck.");
				System.out.println("   - Dealer button rotates clockwise each hand.");
				System.out.println("   - Small Blind (SB) and Big Blind (BB) are posted before cards are dealt.");
				System.out.println();

				System.out.println("4. Dealing");
				System.out.println("   - Each player receives 2 private cards (\"hole cards\").");
				System.out.println("   - Five community cards are dealt in stages:");
				System.out.println("       * Flop: 3 cards");
				System.out.println("       * Turn: 1 card");
				System.out.println("       * River: 1 card");
				System.out.println();

				System.out.println("5. Betting Rounds");
				System.out.println("   a) Pre-Flop: begins with the first player left of the Big Blind.");
				System.out.println("   b) Flop: begins left of the dealer.");
				System.out.println("   c) Turn: same order as the Flop.");
				System.out.println("   d) River: same order as the Flop.");
				System.out.println("   - Actions: Check, Bet, Call, Raise, Fold.");
				System.out.println("   - Betting continues until all players match the wager or fold.");
				System.out.println();

				System.out.println("6. Showdown");
				System.out.println(
						"   - If multiple players remain after the final betting round, all reveal their hands.");
				System.out.println("   - Best 5-card hand wins the pot.");
				System.out.println("   - Ties split the pot evenly.");
				System.out.println();

				System.out.println("7. Additional Rules");
				System.out.println("   - Cards must remain visible above the table.");
				System.out.println("   - Misdeals result in a redeal before betting occurs.");
				System.out.println("   - Out-of-turn actions may be corrected and action may be reopened.");

				System.out.println("The blinds are setup at $1/$3");

			}

		public static void fuckassGameRules()
			{
				System.out.println(
						"Because programming the entirety of poker is too much for my little brain, I'm just going to tell you what hand each player has");
				System.out.println("So sue me");
			}

		public static void dealCards4Player()
			{
				for (int i = 0; i <= 1; i++)
					{
						Deck.player1.add(Deck.deck.get(0));
						Deck.deck.remove(0);
						Deck.player2.add(Deck.deck.get(0));
						Deck.deck.remove(0);
						Deck.player3.add(Deck.deck.get(0));
						Deck.deck.remove(0);
						Deck.player4.add(Deck.deck.get(0));
						Deck.deck.remove(0);
					}
			}

		public static void printPlayerCards()
			{
				// Player 1
				System.out.println("Player 1 has...");
				for (int i = 0; i < Deck.player1.size(); i++)
					{
						System.out.println(Deck.player1.get(i).getValue() + " of " + Deck.player1.get(i).getSuit());
					}

				System.out.println("");

				// Player 2
				System.out.println("Player 2 has...");
				for (int i = 0; i < Deck.player2.size(); i++)
					{
						System.out.println(Deck.player2.get(i).getValue() + " of " + Deck.player2.get(i).getSuit());
					}

				System.out.println("");

				// Player 3
				System.out.println("Player 3 has...");
				for (int i = 0; i < Deck.player3.size(); i++)
					{
						System.out.println(Deck.player3.get(i).getValue() + " of " + Deck.player3.get(i).getSuit());
					}

				System.out.println("");

				// Player 4
				System.out.println("Player 4 has...");
				for (int i = 0; i < Deck.player4.size(); i++)
					{
						System.out.println(Deck.player4.get(i).getValue() + " of " + Deck.player4.get(i).getSuit());
					}

			}

		public static void combineHandsAndCommunity()
			{
				for (int i = 0; i < Deck.community.size(); i++)
					{
						Deck.player1.add(Deck.community.get(i));
						Deck.player2.add(Deck.community.get(i));
						Deck.player3.add(Deck.community.get(i));
						Deck.player4.add(Deck.community.get(i));
					}

			}

		public static void printFullHand(ArrayList<Card> hand)
			{
				for (int i = 0; i < hand.size(); i++)
					{
						System.out.println(hand.get(i).getValue() + " of " + hand.get(i).getSuit());
					}
			}

		public static void flop()
			{
				for (int i = 0; i < 3; i++)
					{
						Deck.community.add(Deck.deck.get(0));
						Deck.deck.remove(0);
					}

				/*
				 * System.out.println("The community cards are...");
				 * System.out.println(Deck.community.get(0).getValue() + " of " +
				 * Deck.community.get(0).getSuit());
				 * System.out.println(Deck.community.get(1).getValue() + " of " +
				 * Deck.community.get(1).getSuit());
				 * System.out.println(Deck.community.get(2).getValue() + " of " +
				 * Deck.community.get(2).getSuit());
				 **/
			}

		public static void turn()
			{
				Deck.community.add(Deck.deck.get(0));
				Deck.deck.remove(0);

				/*
				 * System.out.println("The community cards are...");
				 * System.out.println(Deck.community.get(0).getValue() + " of " +
				 * Deck.community.get(0).getSuit());
				 * System.out.println(Deck.community.get(1).getValue() + " of " +
				 * Deck.community.get(1).getSuit());
				 * System.out.println(Deck.community.get(2).getValue() + " of " +
				 * Deck.community.get(2).getSuit());
				 * System.out.println(Deck.community.get(3).getValue() + " of " +
				 * Deck.community.get(3).getSuit());
				 **/
			}

		public static void river()
			{
				Deck.community.add(Deck.deck.get(0));
				Deck.deck.remove(0);

				System.out.println("The community cards are...");
				System.out.println(Deck.community.get(0).getValue() + " of " + Deck.community.get(0).getSuit());
				System.out.println(Deck.community.get(1).getValue() + " of " + Deck.community.get(1).getSuit());
				System.out.println(Deck.community.get(2).getValue() + " of " + Deck.community.get(2).getSuit());
				System.out.println(Deck.community.get(3).getValue() + " of " + Deck.community.get(3).getSuit());
				System.out.println(Deck.community.get(4).getValue() + " of " + Deck.community.get(4).getSuit());
			}

		public static void sortFullHandRank(ArrayList<Card> hand)
			{
				Collections.sort(hand, new SuitSorting());
				Collections.sort(hand, new RankSorting());
			}
		
		public static void sortFullHandSuit(ArrayList<Card> hand)
			{
				Collections.sort(hand, new RankSorting());
				Collections.sort(hand, new SuitSorting());
			}

		public static void checkHand(ArrayList<Card> hand, String handName)
			{
				Hands.royalFlush(hand, handName);
					
			}
		// Still working

		public static void preflopBetting()
			{

			}

		public static void askForDecision()
			{

			}

		// PREFLOP
		// Set blind
		// Shuffle deck
		// deal two whole cards to each player
		// players choose to fold, call, or raise the bet

		// FLOP
		// burn one card
		// deal 3 community cards
		// start betting round (player left of dealer)
		// Continue round until all bets are matched or one player remains

		// TURN
		// Burn one card
		// Deal one community card
		// Another round of betting

		// RIVER
		// Burn One Card
		// Deal final community card
		// Another Round of Betting

		// Showdown
		// Determine best 5 card hand
		// Compare Hands
		// Declare Winner

	}
