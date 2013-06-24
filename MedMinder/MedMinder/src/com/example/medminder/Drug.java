package com.example.medminder;


public class Drug {
	
	private int serial;
	private String name;
	private String manu;
	private String actSub;
	private String desc;
	
	
	public Drug () {
		super();
	}
	
	public Drug(int serial, String name, String manu, String actSub,
			String desc) {
		super();
		this.serial = serial;
		this.name = name;
		this.manu = manu;
		this.actSub = actSub;
		this.desc = desc;
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
	
	public String getManu() {
		return manu;
	}
	
	public void setManu(String manu) {
		this.manu = manu;
	}
	
	public String getActSub() {
		return actSub;
	}
	
	public void setActSub(String actSub) {
		this.actSub = actSub;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String toString () {
		String str = "No. "+getSerial()+"   Name: "+getName()+"   Active: "+getActSub()+"   Manu: "+getManu()+'\n';
		return str;
	}
}
