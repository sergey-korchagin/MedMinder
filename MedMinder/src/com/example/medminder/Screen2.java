//Drugs information button screen(a_s2)
package com.example.medminder;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.sql.*;
import javax.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;



public class Screen2 extends Activity
{
	private EditText edittext;
//	private TextView view;
	TextView show1;
	 TextView show2;
	 TextView show3;
	
	 //c-tor
		/* 
		 Screen2(TextView a, TextView b, TextView c)
		 {
			 this.show1 = a;
			 this.show2 = b;
			 this.show3 = c;
		}	 
		*/ 
	 @Override
	    protected void onCreate(Bundle savedInstanceState) 
	    {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.a_s2);
	        
	      
	        addKeyListener();
	        
	    }
	 
	
	 


public void addKeyListener() {
	 
	
	
	 edittext = (EditText) findViewById(R.id.editText_enter);
	 //search fro server
	// final String view = edittext.getText().toString();
	//  show1 = (TextView) findViewById(R.id.textView1);
	//  show2 = (TextView) findViewById(R.id.textView2); 
	final String[] drug_list = {"acamol" , "decamol","paramol" , "koks", "viagra", "advil","neurofen","tramal","voltaren","morphium"};
	ListView lview = (ListView) findViewById(R.id.listView_drug_info);
	lview.setAdapter(new ArrayAdapter<String>(this,  android.R.layout.simple_list_item_1,drug_list));		
	lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int position,
				long arg3) {
			Intent intent = new Intent(Screen2.this, Description.class);
			intent.putExtra("drugName", drug_list[position]);
			
	        startActivity(intent);
	        
		//	Toast.makeText(getApplicationContext(), drug_list[position], Toast.LENGTH_SHORT).show();
			
		}
	});
	
	
	// add a keylistener to keep track user input
	edittext.setOnKeyListener(new OnKeyListener() {
	public boolean onKey(View v, int keyCode, KeyEvent event) {
		//String dbtime;
		//String dbUrl = "jdbc:mysql://db4free.net:3306/medminder";
		//@SuppressWarnings("unused")
		//String dbClass = "com.mysql.jdbc.Driver";
		
		// if keydown and "enter" is pressed
		if ((event.getAction() == KeyEvent.ACTION_DOWN)
			&& (keyCode == KeyEvent.KEYCODE_ENTER)) {

		
		//	 show1.setText(edittext.getText().toString()+ ':');
		//	 show2.setText(edittext.getText().toString());
		//	 show2.setText("Drug info here from second variable from object from database");
			
			return true;
		}
		

			
		

		return false;
	}
});
}
}