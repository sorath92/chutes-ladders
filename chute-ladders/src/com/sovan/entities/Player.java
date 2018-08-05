package com.sovan.entities;

/**
 * This class represents the Player. It has a name and he position in a board. 
 * 
 * Here as per the requirement of the game the position is tightly coupled with the Board. This could be removed from the player.  
 * 
 * @author Sovan Kishan Rath
 *
 *	
 */


public class Player {

	
	
	private String name;
	private int position;
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	
	
	
	
	
	
	
	
	
	
}
