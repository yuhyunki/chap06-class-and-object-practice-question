package com.greedy.level04.advanced.shape.model.dto;

/**
 * <pre>
 * Class : ShapeDTO
 * Comment : ShapeMenu에서 생성되는 객체 shape에 대한 DTO 파일
 * History
 * 2023/01/12 (김유현) 처음 작성함
 * </pre>
 * @author 작성자
 * @version 1.0.0
 * @see ShapeMenu, TriangleManager, SquareManager
 * */
public class ShapeDTO {

	/* 클래스 구현에 대한 주석 */
	
	/** 도형의 종류를 나타낸다. 3일 경우 삼각형, 4일 경우 사각형이다. */
	private int type;
	
	/** 도형의 높이 */
	private double height;
	
	/** 도형의 넓이 */
	private double width;
	
	/** 도형의 색상 */
	private String color;
	
	/**
	 * ShapeDTO의 생성자.
	 * @param type 도형의 타입을 나타낸다.
	 * @param height 도형의 높이를 나타낸다.
	 * @param width 도형의 넓이를 나타낸다.
	 */
	public ShapeDTO(int type, double height, double width) {
		this.type = type;
		this.height = height;
		this.width = width;
		this.color = "white";
	}
	
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
	
	public int getType() {
		return type;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public String getColor() {
		return color;
	}
}
