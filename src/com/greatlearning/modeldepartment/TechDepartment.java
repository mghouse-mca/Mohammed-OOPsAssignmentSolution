package com.greatlearning.modeldepartment;

public class TechDepartment extends SuperDepartment {

	private String departmentName = "Tech Department";
	private String todaysWork = "Complete coding of module 1";
	private String workDeadline = "Complete by EOD";
	private String techStackInformation = "Core Java";

	public String getDepartmentName() {
		return departmentName;
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public String getWorkDeadline() {
		return workDeadline;
	}

	public String getTechStackInformation() {
		return techStackInformation;
	}

}
