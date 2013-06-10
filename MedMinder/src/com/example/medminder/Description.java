package com.example.medminder;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Description extends Activity 
{
	  protected void onCreate(Bundle savedInstanceState) 
	    {
		  super.onCreate(savedInstanceState);
		  setContentView(R.layout.drug_desc);
		  
		  Bundle extras = getIntent().getExtras();
		    if (extras != null) {
		    	String DrugName = getIntent().getStringExtra("drugName");
		    	
		    	TextView text_drname = (TextView) findViewById(R.id.textView_Dr_Name);
		    	text_drname.setText(DrugName);
				}
	    }
}
