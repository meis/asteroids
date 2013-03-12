package com.example.asteroids;

import java.util.Vector;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ScoreListAdapter extends BaseAdapter {
	
	private final Activity activity;
	private final Vector<String> list;

	public ScoreListAdapter(Activity activity, Vector<String> list) {
		super();
		this.activity 	= activity;
		this.list 		= list;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = activity.getLayoutInflater();
		View view = inflater.inflate(R.layout.score_list_element, null, true);
		TextView textView =(TextView)view.findViewById(R.id.score_list_title);
		textView.setText(list.elementAt(position));
		ImageView imageView=(ImageView)view.findViewById(R.id.score_list_icon);
		  
		switch (Math.round((float)Math.random()*3)){
		case 0:
			imageView.setImageResource(R.drawable.asteroid1);
			break;
		case 1:
			imageView.setImageResource(R.drawable.asteroid2);
			break;
		default:
			imageView.setImageResource(R.drawable.asteroid3);
			break;
		}
		return view;
	}

	public int getCount() {	
		return list.size();	
	}
	
	public Object getItem(int arg0) {	
		return list.elementAt(arg0);	
	}	
	
	public long getItemId(int position) {
		return position;	
	}
}
