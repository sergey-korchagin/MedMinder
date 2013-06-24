package com.example.medminder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ReportToEmail extends Activity {

	Button button1;
	EditText editText1;
	
	
 @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_to_email);
        
        button1 = (Button) findViewById(R.id.BUTTON_1);
		//editText1 = (EditText) findViewById(R.id.editText1);  //for text 
		
		
		button1.setOnClickListener(new OnClickListener() {
			 
			public void onClick(View v) {
 
			  //String to = editText1.getText().toString();
			  //String subject = textSubject.getText().toString();
			//  String message = textMessage.getText().toString();
			
			  Intent email = new Intent(Intent.ACTION_SEND);
			  email.putExtra(Intent.EXTRA_EMAIL,"medmindercont@gmail.com");//new String[]{ to});
			  //email.putExtra(Intent.EXTRA_CC, new String[]{ to});
			  //email.putExtra(Intent.EXTRA_BCC, new String[]{to});  //String to
			  email.putExtra(Intent.EXTRA_SUBJECT, "MedMinder Report"); 		// string subject
			  email.putExtra(Intent.EXTRA_TEXT, " The message was sent from MedMinder Application");
			 
			  //need this to prompts email client only
			  email.setType("message/rfc822");
			  
			  startActivity(Intent.createChooser(email, "Choose an Email client :"));
			  
			  //Clear text Box
			  //TextView myTextView = (TextView) findViewById(R.id.editText1);
			 // myTextView.setText("");
			  
			  
 
			}
		});
    }

}
