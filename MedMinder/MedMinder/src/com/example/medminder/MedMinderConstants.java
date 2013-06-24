package com.example.medminder;

public class MedMinderConstants {
	
	public static final String DB_URL = "jdbc:mysql://db4free.net:3306/medminder";
	public static final String DB_CLASS = "com.mysql.jdbc.Driver";
	
	//Queries
	public static final String GET_ALL_DRUGS = "SELECT * FROM DRUGS";
	public static final String GET_DRUG_BY_NAME = "SELECT * FROM DRUGS WHERE name = ";
	public static final String GET_DRUGS_BY_MANUFACTURER = "SELECT * FROM DRUGS WHERE manufacturer = ";
	public static final String GET_ALL_DRUGS_COUNT = "SELECT COUNT(*) FROM DRUGS";
	
	public static final String GET_ALL_MANUFACTURERS = "SELECT * FROM MANUFACTURER";
	public static final String GET_MANUFACTURER_BY_NAME = "SELECT * FROM MANUFACTURER WHERE Name=";
	public static final String GET_ALL_MANUFACTURERS_COUNT = "SELECT COUNT(*) FROM MANUFACTURER";
	
	//Constants
	public static final String DB_USER = "medminder";
	public static final String DB_PW = "med1minder";
	public static final int DRUG_COL_COUNT = 5;
	public static final int MAN_COL_COUNT = 3;
	
}
