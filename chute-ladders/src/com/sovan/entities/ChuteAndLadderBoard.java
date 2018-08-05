package com.sovan.entities;

import java.util.HashMap;

/**
 * This class represents the actual board in the game of Chutes and Ladders.
 * 
 * It extends Board
 * 
 * 
 * 
 * @author Sovan Kishan Rath
 *
 *	
 */




public class ChuteAndLadderBoard extends Board {

	
	private final int maxSqares;
	private final HashMap<Integer,Integer> chuteMap;
	private final HashMap<Integer,Integer> ladderMap;
	
	
	
	public ChuteAndLadderBoard(int maxSquares,HashMap<Integer,Integer> chuteMap,HashMap<Integer,Integer> ladderMap) {
		
		super.setBoardName("CHUTE AND LADDERS");
		this.maxSqares = maxSquares;
		this.chuteMap = chuteMap;
		this.ladderMap = ladderMap;
		
	}



	public int getMaxSqares() {
		return maxSqares;
	}



	public HashMap<Integer, Integer> getChuteMap() {
		return chuteMap;
	}



	public HashMap<Integer, Integer> getLadderMap() {
		return ladderMap;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
