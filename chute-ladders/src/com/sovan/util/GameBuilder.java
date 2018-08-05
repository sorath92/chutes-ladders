package com.sovan.util;

import java.util.ArrayList;
import java.util.List;

import com.sovan.entities.Board;
import com.sovan.entities.Game;
import com.sovan.entities.Player;

/**
 * This class is the Game builder class. It instantiates a Game .
 * 
 * This also validates the game rules . For example : Our Chutes and Ladders
 * game should have between 2 to 4 players.
 * 
 * Once validation is done it instantiates the sample Game. This Game is played
 * in the main class to generate result for the players.
 * 
 * @author Sovan Kishan Rath
 *
 * 
 */

public class GameBuilder {

	public static Game buildStandardChuteLaddersGame(String[] players) {

		if (players == null || players.length < 2 || players.length > 4) {

			System.out.println("...... NUMBER OF PLAYERS SHOULD BE BETWEEN 2 TO 4......");

			return null;
		}

		if (validatePlayers(players) == false) {

			System.out.println("...... Player Names should be Alphabet......");

			return null;

		}
		List<Player> playerList = new ArrayList<Player>();
		for (String name : players) {

			Player p = new Player();
			p.setName(name);
			p.setPosition(0);

			playerList.add(p);

		}

		String gameName = "STANDARD CHUTE AND LADDERS";
		Board b = BoardBuilder.getClassicChuteLaddersBoard();

		Game chuteLaddersGame = new Game(gameName, b, playerList);

		return chuteLaddersGame;

	}

	public static boolean validatePlayers(String[] playerNames) {

		for (String p : playerNames) {

			p = p.trim();

			boolean allLetters = p.chars().allMatch(Character::isLetter) && !p.equalsIgnoreCase("") && p != null;

			if (allLetters == false) {

				return false;

			}

		}
		return true;

	}

}
