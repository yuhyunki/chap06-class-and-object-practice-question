package com.greedy.level04.advanced.shape.model.dto;

public class ShapeDTO {

	private int type;
	private double height;
	private double width;
	private String color;
	
	//constructor
	public ShapeDTO(int type, double height, double width) {
		this.type = type;
		this.height = height;
		this.width = width;
		this.color = "white";
	}
	
	//setter
	public void setType(int type) {
		this.type = type;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//getter
	public int getType() {
		return type;
	}
	
	public double getHeight() {
		return type;
	}
	
	public double getWidth() {
		return type;
	}
	
	public String getColor() {
		return color;
	}
	
	
}
