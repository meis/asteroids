package com.example.asteroids;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Asteroids extends Activity {
	private Button bAbout;
	private Button bExit;

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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_asteroids, menu);
        return true;
    }
    
    public void launchAbout(View view) {
    	Intent i = new Intent(this, About.class);
    	startActivity(i);
    }
    
}
