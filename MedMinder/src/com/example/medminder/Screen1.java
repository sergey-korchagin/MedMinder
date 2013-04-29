//My Drugs button screen(a_s1)
package com.example.medminder;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Screen1 extends Activity
{
	
	EditText editText1;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) 
	    {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.a_s1);
	        
	        editText1 = (EditText) findViewById(R.id.editText1);
	    }
	 
	 public void ClickListener(View v)
		{
		 Context context = getApplicationContext();
		 CharSequence text = "under construction";
		 int duration = Toast.LENGTH_SHORT;

		 Toast toast = Toast.makeText(context, text, duration);
		 toast.show();
		//Clear text Box
		  TextView myTextView = (TextView) findViewById(R.id.editText1);
		  myTextView.setText("");
		}
	 
	        

}
