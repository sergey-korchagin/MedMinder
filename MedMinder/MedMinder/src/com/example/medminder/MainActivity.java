package com.example.medminder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_med_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	public void addNewDrugListener(View v) {
		switch (v.getId()) {
		case R.id.addNewDrugButton:
			Intent intent = new Intent(MainActivity.this, AddNewDrug.class);
			startActivity(intent);
			break;
		}
	}
	
	
	public void DrugInfoListener(View v) {
		switch (v.getId()) {
		case R.id.drugInfoButton:
			Intent intent = new Intent(MainActivity.this, DrugInfo.class);
			startActivity(intent);
			break;
		}
	}
	
	public void whereToBuyListener(View v) {
		switch (v.getId()) {
		case R.id.whereToBuyButton:
			Intent intent = new Intent(MainActivity.this, WhereToBuy.class);
			startActivity(intent);
			break;
		}

	}
	
	public void reportToEmailListener(View v) {
		switch (v.getId()) {
		case R.id.reportToEmailButton:
			Intent intent = new Intent(MainActivity.this, ReportToEmail.class);
			startActivity(intent);
			break;
		}
	}
}
