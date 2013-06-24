package com.example.medminder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class DrugDesc extends Activity {
	
	private String drugName;
	private String drugDesc;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.drug_desc);
	
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			drugName = getIntent().getStringExtra("drugName");
			drugDesc = getIntent().getStringExtra("drugDesc");
    	
			TextView drug_name = (TextView) findViewById(R.id.drugName);
			drug_name.setText(drugName);
			
			EditText drug_desc = (EditText) findViewById(R.id.drugDescription);
			drug_desc.setText(drugDesc);
		}

	}
	
	

}
