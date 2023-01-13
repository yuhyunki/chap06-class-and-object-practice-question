package com.greedy.level04.advanced.shape.run;

import com.greedy.level04.advanced.shape.views.ShapeMenu;

/**
 * <pre>
 * Class : Application
 * Comment : 실행용 메인 메소드가 담긴 클래스
 * History
 * 2023/01/12 (김유현) 처음 작성함
 * </pre>
 * @author 김유현
 * @version 1.0.1
 * @see 참고할 class나 외부 url
 * */
public class Application {

	public static void main(String[] args) {
		ShapeMenu shapeMenu = new ShapeMenu();
		shapeMenu.mainMenu();		
	}
}
