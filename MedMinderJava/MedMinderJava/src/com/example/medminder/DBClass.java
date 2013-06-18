package com.example.medminder;

import java.sql.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBClass {

	private static final String DB_URL = "jdbc:mysql://db4free.net:3306/medminder";
	private static final String DB_CLASS = "com.mysql.jdbc.Driver";

	
	public DBClass() { super(); }
	 

	// DRUGS table methods:
	
	public static ResultSet getAllDrugs() {
		try {

			Class.forName(DB_CLASS);
			Connection con = DriverManager.getConnection(DB_URL, MedMinderConstants.DB_USER,
					MedMinderConstants.DB_PW);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(MedMinderConstants.GET_ALL_DRUGS);
			return rs;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static ResultSet getDrugByName(String name) {
		try {
			name = '"'+name+'"';
			Class.forName(DB_CLASS);
			Connection con = DriverManager.getConnection(DB_URL, MedMinderConstants.DB_USER,
					MedMinderConstants.DB_PW);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery(MedMinderConstants.GET_DRUG_BY_NAME+name);
			if (!rs.equals(null))
				return rs;
			else
				return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static int getAllDrugsCount() {
		try {

			Class.forName(DB_CLASS);
			Connection con = DriverManager.getConnection(DB_URL, MedMinderConstants.DB_USER,
					MedMinderConstants.DB_PW);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(MedMinderConstants.GET_ALL_DRUGS_COUNT);
			rs.first();
			int res = rs.getInt(1);
			return res;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static ResultSet getDrugsByManufacturer (String man) {
		try {
			man = '"'+man+'"';
			Class.forName(DB_CLASS);
			Connection con = DriverManager.getConnection(DB_URL, MedMinderConstants.DB_USER,
					MedMinderConstants.DB_PW);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery(MedMinderConstants.GET_DRUGS_BY_MANUFACTURER+man);
			if (!rs.equals(null))
				return rs;
			else
				return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	// MANUFACTURER table methods:

	public static ResultSet getAllManufacturers() {
		try {

			Class.forName(DB_CLASS);
			Connection con = DriverManager.getConnection(DB_URL, MedMinderConstants.DB_USER,
					MedMinderConstants.DB_PW);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(MedMinderConstants.GET_ALL_MANUFACTURERS);
			return rs;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static ResultSet getManuFacturerByName(String name) {
		try {
			name = '"'+name+'"';
			Class.forName(DB_CLASS);
			Connection con = DriverManager.getConnection(DB_URL, MedMinderConstants.DB_USER,
					MedMinderConstants.DB_PW);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery(MedMinderConstants.GET_MANUFACTURER_BY_NAME+name);
			if (!rs.equals(null))
				return rs;
			else
				return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static int getAllManufacturersCount() {
		try {

			Class.forName(DB_CLASS);
			Connection con = DriverManager.getConnection(DB_URL, MedMinderConstants.DB_USER,
					MedMinderConstants.DB_PW);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(MedMinderConstants.GET_ALL_MANUFACTURERS_COUNT);
			rs.first();
			int res = rs.getInt(1);
			return res;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static List<Drug> getDrugList (ResultSet rs) {
		List<Drug> list = new ArrayList<Drug>();
		if (rs != null) {
			try {
				while (rs.next()) {
						Drug drug = new Drug();
						drug.setSerial(rs.getInt(1));
						drug.setName(rs.getString(2));
						drug.setManu(rs.getString(3));
						drug.setActSub(rs.getString(4));
						drug.setDesc(rs.getString(5));
						list.add(drug);
				}
								
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
		return null;
	}
	
	public static List<Manufacturer> getManuList (ResultSet rs) {
		List<Manufacturer> list = new ArrayList<Manufacturer>();
		if (rs != null) {
			try {
				while (rs.next()) {
					Manufacturer manu = new Manufacturer();
					manu.setSerial(rs.getInt(1));
					manu.setName(rs.getString(2));
					manu.setDescription(rs.getString(3));
					list.add(manu);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
		return null;
	}
	

	public static void main(String[] args) {
		
		ResultSet rs = getAllManufacturers();
		List<Manufacturer> list = getManuList(rs);
		
		System.out.println(list.toString());		
		/*
		ResultSet rs = getDrugsByManufacturer("teva pharmaceutical industries ltd");

		//
		try {
			while (rs.next()){
				for (int j=1; j<=MedMinderConstants.MAN_COL_COUNT; j++)
					System.out.println(rs.getString(j));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	
} // end class
