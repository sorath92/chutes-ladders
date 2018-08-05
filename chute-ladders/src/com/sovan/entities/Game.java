package com.sovan.entities;

import java.util.List;

/**
 * This class represents the Game. It has a Name, the Board in which the game is played and a List of players. 
 * 
 * @author Sovan Kishan Rath
 *
 *	
 */

public class Game {

	
	
	
	private final String gameName;
	private final Board gameBoard;
	private final List<Player> playerList; 
	
	
	public Game(String gameName,Board b,List<Player> playerList) {
		
		
		this.gameBoard = b;
		this.gameName = gameName;
		this.playerList = playerList;
		
		
		
	}


	public String getGameName() {
		return gameName;
	}


	public Board getGameBoard() {
		return gameBoard;
	}


	public List<Player> getPlayerList() {
		return playerList;
	}


	
	
	
	
	
	
	
	
	
	
}
