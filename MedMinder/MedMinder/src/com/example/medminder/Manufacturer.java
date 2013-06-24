package com.example.medminder;

public class Manufacturer {
	private int serial;
	private String name;
	private String description;
	
	
	public Manufacturer () {
		super();
	}
	
	public Manufacturer (int serial, String name, String desc) {
		super ();
		this.serial = serial;
		this.name = name;
		this.description = desc;
		
		
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString () {
		String str = "No. "+getSerial()+"   Name: "+getName()+"   Desc: "+getDescription()+'\n';
		return str;
	}

}
