package com.example.asteroids;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Asteroids extends Activity {
	private Button bAbout;
	private Button bExit;
	private Button bConfig;
	private Button bScores;
	
	public static ScoreArray store = new ScoreArray();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asteroids);
        
		bAbout = (Button) findViewById(R.id.AboutButton);
		
		bAbout.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				launchAbout(null);
			}
		});
		
		bExit = (Button) findViewById(R.id.ExitButton);
		
		bExit.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				finish();
			}
		});
		
		bConfig = (Button) findViewById(R.id.ConfigureButton);
		
		bConfig.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				launchConfiguration(null);
			}
		});
		
		bScores = (Button) findViewById(R.id.ScoresButton);
		
		bScores.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				launchScores(null);
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    
    @Override     
    public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {		
			case R.id.about:		
				launchAbout(null);	
				break;	
			case R.id.config:
				launchConfiguration(null);
				break;
		}
		
		return true; 
    }
    
    public void launchAbout(View view) {
    	Intent i = new Intent(this, About.class);
    	startActivity(i);
    }
    
    public void launchConfiguration(View view) {
    	Intent i = new Intent(this, Configuration.class);
    	startActivity(i);
    }
    
    public void launchScores(View view) {
    	Intent i = new Intent(this, Scores.class);
    	startActivity(i);
    }
    
}
