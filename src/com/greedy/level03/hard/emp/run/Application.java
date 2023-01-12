package com.greedy.level03.hard.emp.run;

import java.util.Scanner;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

public class Application {

	public static void main(String[] args) {

		//스캐너를 이용해서 모든 직원 정보를 입력 받아
		Scanner sc = new Scanner(System.in);
		
		//기본 생성자로 인스턴스 생성 후 setter를 이용하여 필드 값 변경 후
		EmployeeDTO employee1 = new EmployeeDTO();
		employee1.setNumber(sc.nextInt());
		sc.nextLine();
		employee1.setName(sc.nextLine());
		employee1.setDept(sc.nextLine());
		employee1.setJob(sc.nextLine());
		employee1.setAge(sc.nextInt());
		employee1.setGender(sc.next().charAt(0));
		employee1.setSalary(sc.nextInt());
		employee1.setBonusPoint(sc.nextDouble());
		sc.nextLine();
		employee1.setPhone(sc.nextLine());
		employee1.setAddress(sc.nextLine());
		
		//getter를 이용하여 모든 필드 값 출력
		System.out.println(employee1.getNumber());
		System.out.println(employee1.getName());
		System.out.println(employee1.getDept());
		System.out.println(employee1.getJob());
		System.out.println(employee1.getAge());
		System.out.println(employee1.getGender());
		System.out.println(employee1.getSalary());
		System.out.println(employee1.getBonusPoint());
		System.out.println(employee1.getPhone());
		System.out.println(employee1.getAddress());

	}

}
