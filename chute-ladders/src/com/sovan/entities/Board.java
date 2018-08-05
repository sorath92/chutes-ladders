package com.sovan.entities;

/**
 * 
 * 
 * The board is abstract so that it can accommodate other Board games like chess
 * , Snake and Ladders etc.
 * 
 * This abstract the common board properties.
 * 
 * @author Sovan Kishan Rath
 *
 */

public abstract class Board {

	private String boardName;

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

}
