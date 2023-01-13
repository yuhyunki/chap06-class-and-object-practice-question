package com.greedy.level04.advanced.shape.manager;

import com.greedy.level04.advanced.shape.model.dto.ShapeDTO;

public class TriangleManager {

	public void calcPerimeter(ShapeDTO shape) {
		double sum = Math.pow(shape.getHeight(), 2) + Math.pow(shape.getWidth(), 2);
		double sumRoot = Math.sqrt(sum);
		double perimeter = shape.getHeight() + shape.getWidth() + sumRoot;
		System.out.println("삼각형의 둘레는 " + perimeter + "입니다.");
	}
	
	public void calcArea(ShapeDTO shape) {
		double area = shape.getHeight() * shape.getWidth() / 2;
		System.out.println("삼각형의 면적은 " + area + "입니다.");
	}
	
	public void printShape(ShapeDTO shape) {
		if(shape.getType() == 3) {
			System.out.println("도형 타입 : 삼각형");
		}
		System.out.println("높이 : " + shape.getHeight());
		System.out.println("너비 : " + shape.getWidth());
		System.out.println("색상 : " + shape.getColor());
	}
	
	public void paintColor(ShapeDTO shape, String color) {
		System.out.println("선택하신 도형을 " + color + "로 색칠합니다.");
		shape.setColor(color);
	}
}
