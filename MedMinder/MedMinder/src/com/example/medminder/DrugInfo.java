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
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class DrugInfo extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.drug_info);

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con;
			try {
				con = DriverManager.getConnection(MedMinderConstants.DB_URL,
						MedMinderConstants.DB_USER, MedMinderConstants.DB_PW);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt
						.executeQuery(MedMinderConstants.GET_ALL_DRUGS);
				
				List<Drug> list = DBClass.getDrugList(rs);
				int drugCount = DBClass.getAllDrugsCount();
				final String[] nameList = new String[drugCount];
				final String[] descList = new String[drugCount];
				
				int index = 0;
				for (Drug current : list) {
					nameList[index] = current.getName();
					descList[index++] = current.getDesc();
				}
				
				ListView lview = (ListView) findViewById(R.id.drugList);
				lview.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nameList));	
				lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> arg0, View arg1, int index,
							long arg3) {
						Intent intent = new Intent(DrugInfo.this, DrugDesc.class);
						intent.putExtra("drugName", nameList[index]);
						intent.putExtra("drugDesc", descList[index]);
						startActivity(intent);
					}
				});
				
											
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			this.setTitle(".....Class com.mysql.jdbc.Driver not found!");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			this.setTitle("Illegal access");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			this.setTitle("instantiation exc eption");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
