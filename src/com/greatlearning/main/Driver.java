package com.greatlearning.main;

import com.greatlearning.modeldepartment.AdminDepartment;
import com.greatlearning.modeldepartment.HrDepartment;
import com.greatlearning.modeldepartment.TechDepartment;

public class Driver {

	private static String welcome = " Welcome to ";

	public static void main(String[] args) {

		AdminDepartment adminDepartment = new AdminDepartment();
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();

		System.out.println(welcome + adminDepartment.getDepartmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());

		System.out.println();
		System.out.println();

		System.out.println(welcome + hrDepartment.getDepartmentName());
		System.out.println(hrDepartment.getDoActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());

		System.out.println();
		System.out.println();

		System.out.println(welcome + techDepartment.getDepartmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());

	}

}
