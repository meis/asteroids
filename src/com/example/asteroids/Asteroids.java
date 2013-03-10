package com.example.asteroids;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Asteroids extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asteroids);
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
