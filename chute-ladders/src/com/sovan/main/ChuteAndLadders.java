package com.sovan.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.sovan.entities.ChuteAndLadderBoard;
import com.sovan.entities.Game;
import com.sovan.entities.Player;
import com.sovan.util.DiceUtils;
import com.sovan.util.GameBuilder;

/**
 * This class represents the game play of chute and Ladders. Here is where the
 * fun starts.
 * 
 * The Position of the main method is here too.
 * 
 * @author Sovan Kishan Rath
 *
 * 
 */

public class ChuteAndLadders {

	public static void main(String[] args) {

		int p = playStandardChuteAndLadders(new String[] { "alpha", "beta" });

	}

	/*
	 * This method (playStandardChuteAndLadders) plays the game.
	 * 
	 * It returns an integer which can be used for logging like how many games were
	 * played etc.
	 * 
	 * 
	 */

	public static int playStandardChuteAndLadders(String[] playerNames) {

		// Instantiate the game based on the number of players .
		Game game = GameBuilder.buildStandardChuteLaddersGame(playerNames);

		if (game == null) {

			return 0;

		}

		List<Player> playerList = game.getPlayerList();

		// All players roll the dice once to get a number between 1 - 6 . The player who
		// gets highest gets the first chance.
		// Others follow in the order of initial order
		List<Player> orderList = orderOfPlayers(playerList);

		int newPosition = 0;
		int tempStep = 0;
		ChuteAndLadderBoard b = (ChuteAndLadderBoard) game.getGameBoard();
		int winPosition = b.getMaxSqares();
		HashMap<Integer, Integer> chuteMap = b.getChuteMap();
		Set<Integer> chuteKeySet = chuteMap.keySet();

		HashMap<Integer, Integer> ladderMap = b.getLadderMap();
		Set<Integer> ladderKeySet = ladderMap.keySet();

		boolean winnerDeclared = false;
		String opString = "";
		int turnNumber = 1;
		while (winnerDeclared == false) {

			for (Player p : orderList) {
				opString = p.getName() + ": ";

				// roll dice to get the new position.
				tempStep = DiceUtils.rollDice();
				newPosition = p.getPosition() + tempStep;

				opString = opString + p.getPosition() + " --> " + newPosition;

				// check if the new position has a chute or ladder to obtain the final position
				if (chuteKeySet.contains(new Integer(newPosition))) {

					newPosition = chuteMap.get(new Integer(newPosition));

					opString = opString + " --CHUTE--> " + newPosition;

				} else if (ladderKeySet.contains(new Integer(newPosition))) {

					newPosition = ladderMap.get(new Integer(newPosition));

					opString = opString + " --LADDER--> " + newPosition;

				}

				// check if the new position is beyond the win Position which is 100. When such
				// a thing happens Player skips turn
				if (newPosition > winPosition) {

					continue;

				} else {
					// Update the new position and output the string in the commandline
					p.setPosition(newPosition);
					opString = turnNumber + ": " + opString;
					turnNumber = turnNumber + 1;
					System.out.println(opString);

				}

				// If someone reaches 100 then announce he is winner
				if (newPosition == winPosition) {

					winnerDeclared = true;

					System.out.println("The winner is " + p.getName());

					break;

				}

			}

		}
		return 1; // return 0 if the game is not played. 1 if the game is played (Only used for
					// logging purpose.)

	}

	public static List<Player> orderOfPlayers(List<Player> playerList) {

		int startIndex = 0;
		int step = 0;
		int tempStep = 0;
		for (int i = 0; i < playerList.size(); i++) {

			tempStep = DiceUtils.rollDice();

			if (tempStep > step) {

				startIndex = i;

			}

		}
		List<Player> orderList = new ArrayList<Player>();
		orderList.add(playerList.get(startIndex));

		for (int i = 0; i < playerList.size(); i++) {

			if (i != startIndex) {

				orderList.add(playerList.get(i));

			}

		}

		return orderList;
	}

}
