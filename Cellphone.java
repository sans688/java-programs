package com.company;

public class Cellphone {

	private int ram;
	private int noOfCameras;
	private String model;
	private String processor;
	private String color; 

	public void setModel(String model) {
		this. model = model;/*this.model refers to private string model*/
		String validModel = model.toLowerCase();
		if(validModel.equals("nord") || validModel.equals("7Pro")) {
			this.model = model;
		}
		else {
			this.model="unknown";
		}
		
		}
	public String getModel() {
		return this.model;
	}
}
