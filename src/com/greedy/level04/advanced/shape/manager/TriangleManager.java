package com.greedy.level04.advanced.shape.manager;

import com.greedy.level04.advanced.shape.model.dto.ShapeDTO;

public class TriangleManager {

	public void calcPerimeter(ShapeDTO shape) {
		double sum = Math.pow(shape.getHeight(), 2) + Math.pow(shape.getWidth(), 2);
		double sumRoot = Math.sqrt(sum);
		double perimeter = shape.getHeight() + shape.getWidth() + sumRoot;
		System.out.println("삼각형의 둘레는 " + perimeter + "입니다.");
	}
	
}
