package com.example.asteroids;

import java.util.Vector;

public interface ScoreStorage {
	
	public void saveScore(int score, String name, long date);
	
	public Vector<String> scoreList(int quantity);

}
