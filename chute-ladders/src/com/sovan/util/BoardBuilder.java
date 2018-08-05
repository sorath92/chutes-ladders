package com.sovan.util;

import java.util.HashMap;

import com.sovan.entities.Board;
import com.sovan.entities.ChuteAndLadderBoard;

/**
 * This class is the board builder class It instantiates a board .
 * 
 * This adds he position of the chutes and ladders.
 * 
 * If there are different types of board could be instantiated here.
 * 
 * @author Sovan Kishan Rath
 *
 * 
 */

public class BoardBuilder {

	public static Board getClassicChuteLaddersBoard() {

		int numberOfSquares = 100;

		HashMap<Integer, Integer> chuteMap = new HashMap<Integer, Integer>();

		chuteMap.put(98, 78);
		chuteMap.put(95, 75);
		chuteMap.put(93, 73);
		chuteMap.put(87, 24);

		chuteMap.put(64, 60);
		chuteMap.put(62, 19);
		chuteMap.put(56, 53);

		chuteMap.put(49, 11);
		chuteMap.put(47, 26);
		chuteMap.put(16, 6);

		HashMap<Integer, Integer> ladderMap = new HashMap<Integer, Integer>();

		ladderMap.put(1, 38);
		ladderMap.put(4, 14);
		ladderMap.put(9, 31);
		ladderMap.put(21, 42);

		ladderMap.put(28, 84);
		ladderMap.put(36, 44);
		ladderMap.put(51, 67);

		ladderMap.put(71, 91);
		ladderMap.put(80, 100);

		ChuteAndLadderBoard b = new ChuteAndLadderBoard(numberOfSquares, chuteMap, ladderMap);

		return b;
	}

}
