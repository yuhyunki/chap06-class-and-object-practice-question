package com.greedy.level04.advanced.shape.views;

import java.util.Scanner;

import com.greedy.level04.advanced.shape.manager.TriangleManager;
import com.greedy.level04.advanced.shape.model.dto.ShapeDTO;

public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		//반복문을 이용해 메뉴 실행
		while(true) {
			System.out.println("============ 도형계산기 ============");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.println("===================================");
			System.out.print("계산하려는 도형을 선택하세요 : ");
			int num = 0;
			num = sc.nextInt();
			
			if(!(num == 3 || num == 4 || num == 9)) {
				System.out.println("계산할 수 없는 도형입니다. 다시 입력하세요.");
				continue;
			} else if(num == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(num == 3) {
				System.out.println("도형의 높이를 입력하세요 : ");
				double height = sc.nextDouble();
				System.out.println("도형의 너비를 입력하세요 : ");
				double width = sc.nextDouble();
				ShapeDTO shape = new ShapeDTO(num, height, width);
				triangleMenu(shape);
			} else if(num == 4) {
				System.out.println("도형의 높이를 입력하세요 : ");
				double height = sc.nextDouble();
				System.out.println("도형의 너비를 입력하세요 : ");
				double width = sc.nextDouble();
				ShapeDTO shape = new ShapeDTO(num, height, width);
				squareMenu(shape);
			}
		}
	}
	
	private void triangleMenu(ShapeDTO shape) {
		TriangleManager tm = new TriangleManager();
		while(true) {
			System.out.println("========= 삼각형 계산기 =========");
			System.out.println("1. 삼각형의 둘레 구하기");
			System.out.println("2. 삼각형의 면적 구하기");
			System.out.println("3. 선택한 도형 정보 출력하기");
			System.out.println("4. 도형의 색상 칠하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println("===============================");
			System.out.print("메뉴를 선택하세요 : ");
			int num = 0;
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				
			}
		}
	}
	
	private void squareMenu(ShapeDTO shape) {
		
	}
	
	private String inputColor() {
		return "dkkk";
	}
	
}
