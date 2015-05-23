package com.princeapp.toastapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Toast for The Cat Button
		// Getting an instance of the button thecatbtn defined in activity_main.xml
		Button btn = (Button) findViewById(R.id.thecatbtn);
		
		// Defining onClickListener for the button thecatbtn
		OnClickListener listener = new OnClickListener (){
			
			// This will be executed when user touches the button thecatbtn
			public void onClick(View v){
				
				// Display Toast Message "You Clicked on The Cat" for a long time
				Toast.makeText(getBaseContext(), "You Clicked on The Cat" , Toast.LENGTH_LONG ).show();
			}
		};
		
		// Setting onClick event listener for the button thecatbtn
		btn.setOnClickListener(listener);
		
		//Toast for Things 1 Button
		Button bt = (Button) findViewById(R.id.thn1btn);
		
		OnClickListener l = new OnClickListener (){
			
			public void onClick(View v){
				
				Toast.makeText(getBaseContext(), "You Clicked on Things 1" , Toast.LENGTH_LONG ).show();
			}
		};
		bt.setOnClickListener(l);
		
		//Toast for Things 2 Button
		Button bn = (Button) findViewById(R.id.thn2btn);
		
		OnClickListener ln = new OnClickListener (){
			
			public void onClick(View v){
				
				Toast.makeText(getBaseContext(), "You Clicked on Things 2" , Toast.LENGTH_LONG ).show();
			}
		};
		bn.setOnClickListener(ln);
		
		//Toast for Thingamajigger Button
		Button btnt = (Button) findViewById(R.id.thinamabtn);
		
		OnClickListener lbtnt = new OnClickListener (){
			
			public void onClick(View v){
				
				Toast.makeText(getBaseContext(), "You Clicked on Thingamajigger" , Toast.LENGTH_LONG ).show();
			}
		};
		btnt.setOnClickListener(lbtnt);
		
		//Toast for Sally Button
		Button btns = (Button) findViewById(R.id.sallybtn);
		
		OnClickListener lns = new OnClickListener (){
			
			public void onClick(View v){
				
				Toast.makeText(getBaseContext(), "You Clicked on Sally" , Toast.LENGTH_LONG ).show();
			}
		};
		btns.setOnClickListener(lns);
		
		//Toast for Nick Button
		Button btnn = (Button) findViewById(R.id.nickbtn);
		
		OnClickListener lnn = new OnClickListener (){
			
			public void onClick(View v){
				
				Toast.makeText(getBaseContext(), "You Clicked on Nick" , Toast.LENGTH_LONG ).show();
			}
		};
		btnn.setOnClickListener(lnn);
		
		//Toast for Dr. Suess Button
		Button btnd = (Button) findViewById(R.id.drsbtn);
		
		OnClickListener lnd = new OnClickListener (){
			
			public void onClick(View v){
				
				Toast.makeText(getBaseContext(), "You Clicked on Dr. Suess" , Toast.LENGTH_LONG ).show();
			}
		};
		btnd.setOnClickListener(lnd);
	}			
	}

