package com.greedy.level04.advanced.shape.views;

import java.util.Scanner;

import com.greedy.level04.advanced.shape.manager.SquareManager;
import com.greedy.level04.advanced.shape.manager.TriangleManager;
import com.greedy.level04.advanced.shape.model.dto.ShapeDTO;

/**
 * <pre>
 * Class : ShapeMenu
 * Comment : 실행시 보게 되는 메뉴 구성을 담당하는 클래스입니다.
 * History
 * 2023/01/12 (김유현) 처음 작성함
 * </pre>
 * @author 김유현
 * @version 1.0.1
 * */
public class ShapeMenu {

	/** 입력을 받기 위해 스캐너 클래스를 객체sc로 생성한다. */
	private Scanner sc = new Scanner(System.in);

	/**
	 * 메인메뉴
	 */
	public void mainMenu() {
		while(true) {
			System.out.println("============ 도형계산기 ============");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.println("===================================");
			System.out.print("계산하려는 도형을 선택하세요 : ");
			
			int num = 0;
			
			num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 3:
				System.out.println("도형의 높이를 입력하세요 : ");
				double height = sc.nextDouble();
				System.out.println("도형의 너비를 입력하세요 : ");
				double width = sc.nextDouble();
				ShapeDTO shape = new ShapeDTO(num, height, width);
				triangleMenu(shape);
				continue;
			case 4:
				System.out.println("도형의 높이를 입력하세요 : ");
				double height2 = sc.nextDouble();
				System.out.println("도형의 너비를 입력하세요 : ");
				double width2 = sc.nextDouble();
				ShapeDTO shape2 = new ShapeDTO(num, height2, width2);
				squareMenu(shape2);
				continue;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("계산할 수 없는 도형입니다. 다시 입력하세요.");
				continue;
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
				tm.calcPerimeter(shape);
				break;
			case 2:
				tm.calcArea(shape);
				break;
			case 3:
				tm.printShape(shape);
				break;
			case 4:
				tm.paintColor(shape, inputColor());
				break;
			case 9:
				return;
			}
		}
	}

	private void squareMenu(ShapeDTO shape) {
		
		SquareManager sm = new SquareManager();
		
		while(true) {
			System.out.println("========= 삼각형 계산기 =========");
			System.out.println("1. 사각형의 둘레 구하기");
			System.out.println("2. 사각형의 면적 구하기");
			System.out.println("3. 선택한 도형 정보 출력하기");
			System.out.println("4. 도형의 색상 칠하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println("===============================");
			System.out.print("메뉴를 선택하세요 : ");
			
			int num = 0;
			
			num = sc.nextInt();

			switch(num) {
			case 1:
				sm.calcPerimeter(shape);
				break;
			case 2:
				sm.calcArea(shape);
				break;
			case 3:
				sm.printShape(shape);
				break;
			case 4:
				sm.paintColor(shape, inputColor());
				break;
			case 9:
				return;
			}
		}
	}

	private String inputColor() {
		System.out.println("어떤 색상으로 도형을 칠할까요?");
		sc.nextLine();
		String color = sc.nextLine();
		
		return color;
	}
}
