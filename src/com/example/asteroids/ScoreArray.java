package com.example.asteroids;

import java.util.Vector;

public class ScoreArray implements ScoreStorage {
	
	private Vector<String> scoreList;
	
	public ScoreArray() {
		scoreList = new Vector<String>();
		scoreList.add("123000 Pepito Domingez");
		scoreList.add("111000 Pedro Martinez");
		scoreList.add("011000 Paco Pérez");
   }

	@Override
	public void saveScore(int score, String name, long date) {
		scoreList.add(0, score + " " + name);
	}

	@Override
	public Vector<String> scoreList(int quantity) {
		return scoreList;
	}

}
