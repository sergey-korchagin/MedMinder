package com.example.medminder;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;

public class MedMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_med_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.med_main, menu);
		return true;
	}
	//Ha Trufot Sheli
	public void ClickListener1(View v)
	{
		switch (v.getId()) 
		{
		    case R.id.BUTTON_1:
		        Intent intent = new Intent(MedMainActivity.this, Screen1.class);
		        startActivity(intent);
		        break;
	    }
		
	}
	//Meida al Trufot
	public void ClickListener2(View v)
	{
		switch (v.getId()) 
		{
		    case R.id.button2:
		        Intent intent = new Intent(MedMainActivity.this, Screen2.class);
		        startActivity(intent);
		        break;
	    }
		
	}
	//Maakav al Trufot
	public void ClickListener3(View v)
	{
		switch (v.getId()) 
		{
		    case R.id.button3:
		        Intent intent = new Intent(MedMainActivity.this, Screen3.class);
		        startActivity(intent);
		        break;
	    }
		
	}
	//Where Buy
	public void ClickListener5(View v)
	{
		switch (v.getId()) 
		{
		    case R.id.button4:
		        Intent intent = new Intent(MedMainActivity.this, Screen4.class);
		        startActivity(intent);
		        break;
	    }
		
	}
	//Send To Email
	public void ClickListener4(View v)
	{
		switch (v.getId()) 
		{
		    case R.id.button5:
		        Intent intent = new Intent(MedMainActivity.this, Screen5.class);
		        startActivity(intent);
		        break;
	    }
		
	}
	
		
	
		
	//Menu Listener
		@Override 
	public	boolean onOptionsItemSelected(MenuItem item) 
		{
		    switch (item.getItemId()) 
			{
		    case R.id.action_settings:
		    //    method
		       return true;
		    case R.id.action_about:
		        showAbout();
		        return true;
		    case R.id.action_exit:
			    exit();
			       return true;
		    default:
		        return super.onOptionsItemSelected(item);
		    }
		}
	//about menu button
	public void showAbout()
	{
			
		Intent intent = new Intent(MedMainActivity.this, AboutMenu.class);
        startActivity(intent);
	}
	
	//exit menu button
	public void exit()
	{
		System.exit(0);
	}
		
		
		
		
	}
	
	

