import java.util.ArrayList;
import java.util.Scanner;

import ObjectCreation.Card;

public class GameProcesses
	{
		static ArrayList<Card> player1 = new ArrayList<Card>();
		static ArrayList<Card> player2 = new ArrayList<Card>();
		static ArrayList<Card> community = new ArrayList<Card>();

		// Psuedo Code

		// INTRO

		public static void gameRules()
			{
				System.out.println("Welcome to Texas Hold'em Poker!");
				System.out.println("--------------------------------------------------");
				System.out.println("1. Each player is dealt two private cards (called 'hole cards').");
				System.out.println("2. Five community cards are dealt face-up on the table.");
				System.out.println(
						"3. Players use any combination of their two hole cards and the five community cards to make the best five-card hand.");
				System.out.println();
				System.out.println("The game consists of four betting rounds:");
				System.out.println("--------------------------------------------------");
				System.out
						.println("1. Pre-Flop: After getting hole cards, players bet starting left of the big blind.");
				System.out.println(
						"2. The Flop: Three community cards are dealt face up. Another round of betting begins.");
				System.out.println("3. The Turn: A fourth community card is dealt. Another betting round follows.");
				System.out.println(
						"4. The River: A fifth and final community card is dealt. The last betting round takes place.");
				System.out.println();
				System.out.println(
						"After the final betting round, remaining players reveal their cards in a 'showdown'.");
				System.out.println("The player with the best five-card poker hand wins the pot.");
				System.out.println();
				System.out.println("Poker hand rankings from highest to lowest:");
				System.out.println("--------------------------------------------------");
				System.out.println("1. Royal Flush - A, K, Q, J, 10 all of the same suit");
				System.out.println("2. Straight Flush - Five cards in sequence, all of the same suit");
				System.out.println("3. Four of a Kind - Four cards of the same rank");
				System.out.println("4. Full House - Three of a kind plus a pair");
				System.out.println("5. Flush - Five cards of the same suit, any order");
				System.out.println("6. Straight - Five cards in sequence of mixed suits");
				System.out.println("7. Three of a Kind - Three cards of the same rank");
				System.out.println("8. Two Pair - Two different pairs");
				System.out.println("9. One Pair - Two cards of the same rank");
				System.out.println("10. High Card - Highest single card when no other hand is made");
				System.out.println();
				System.out.println("Blinds and Betting:");
				System.out.println("--------------------------------------------------");
				System.out.println("- The player to the dealer's left posts the small blind.");
				System.out.println("- The next player posts the big blind (usually double the small blind).");
				System.out.println("- Betting proceeds clockwise from the big blind.");
				System.out.println("- Players can fold, call, or raise during their turn.");
				System.out.println();
				System.out.println("Winning the Pot:");
				System.out.println("--------------------------------------------------");
				System.out.println(
						"- A player can win by having the best hand at showdown, or by making everyone else fold before showdown.");
				System.out.println();
				System.out.println("Good luck and have fun playing Texas Hold'em!");
				System.out.println("");

			}

		public static int numberOfPlayers()
			{
				System.out.println("How many players are in this game?");
				System.out.println("The number must 2<=x<=4");
				Scanner userIntInput = new Scanner(System.in);
				int numberOfPlayers = userIntInput.nextInt();
				if (numberOfPlayers >= 2 && numberOfPlayers <= 4)
					{
						
						return numberOfPlayers;
					}
				

				numberOfPlayers();
				return -1;

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
