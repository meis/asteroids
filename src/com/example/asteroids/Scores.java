package com.example.asteroids;

import android.app.ListActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Scores extends ListActivity {

	 @Override public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		setContentView(R.layout.scores);		
		setListAdapter(new ArrayAdapter<String>(this,		
				android.R.layout.simple_list_item_1,
				Asteroids.store.scoreList(10)));
	 }

}