package com.vti.backend;

import java.util.Date;

public class Program {

	public static void main(String args[]) {
		
		//Doi tuogg 1
		Department department1 = new Department();
		department1.id = 1;
		department1.departmentName = "Phòng HR";
		
		//Doi tuong 2
		Department department2 = new Department();
		department2.id = 2;
		department2.departmentName = "Phòng R&D";
		
		System.out.println("Thông tin của department1");
		System.out.println("Id:" +  department1.id);
		System.out.println("Name:" + department1.departmentName);
		
		
		//Khoi tao user
		User user1 = new User();
		user1.id = 1;
		user1.department = department1;
		user1.gender = Gender.MALE;
		user1.dateoffBirth = new Date("2024/07/19");
		
		//Inser ra thong của user vừa khơi tạo
		
	}
}
