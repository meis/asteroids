package com.example.asteroids;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class Scores extends ListActivity {

	 @Override public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		setContentView(R.layout.scores);		
		setListAdapter(new ScoreListAdapter(this, Main.store.scoreList(10)));
	 }
	 
	 @Override protected void onListItemClick(ListView listView, View view, int position, long id) {
		 super.onListItemClick(listView, view, position, id);
		 Object o = getListAdapter().getItem(position);
		 Toast.makeText(this, 
				 getString(R.string.player) + " " + Integer.toString(position)
				 +  " - " + o.toString(),Toast.LENGTH_LONG).show();
	 	}	 
	
}