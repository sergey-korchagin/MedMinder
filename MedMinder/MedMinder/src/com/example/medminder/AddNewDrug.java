package com.example.medminder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AddNewDrug extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_new_drug);

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
						
			int index = 0;
			for (Drug current : list) {
				nameList[index++] = current.getName();
			}
			
			ListView lview = (ListView) findViewById(R.id.addNewDrugList);
			lview.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nameList));
			lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int index,
						long arg3) {
					Intent intent = new Intent(AddNewDrug.this, AddReminder.class);
					intent.putExtra("drugName", nameList[index]);
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
}

