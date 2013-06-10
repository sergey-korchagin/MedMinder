package com.example.medminder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class reminder extends Activity 
{
	  protected void onCreate(Bundle savedInstanceState) 
	    {
		  super.onCreate(savedInstanceState);
		  setContentView(R.layout.reminder);
		  
		  Bundle extras = getIntent().getExtras();
		    if (extras != null) {
		    	String DrugName = getIntent().getStringExtra("drugName");
		    	
		    	TextView text_drname = (TextView) findViewById(R.id.textView_Dr_Name);
		    	text_drname.setText(DrugName);
			}
				
	    }
	  public void ClickListenerSub(View v)
		{
			switch (v.getId()) 
			{
			    case R.id.button1:
			    	Toast.makeText(getApplicationContext(), "Reminder Submited", Toast.LENGTH_SHORT).show();
			        break;
		    }
}
}
