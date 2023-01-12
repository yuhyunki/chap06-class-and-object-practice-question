package com.greedy.level02.normal.student.run;

import java.util.Scanner;

import com.greedy.level02.normal.student.model.vo.StudentVO;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		StudentVO student1 = new StudentVO(sc.nextInt(), sc.nextInt(), sc.nextLine() + sc.nextLine(), sc.nextDouble(), sc.next().charAt(0));
		
		student1.printInformation();
	}

}
