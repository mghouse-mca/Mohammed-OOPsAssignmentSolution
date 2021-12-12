package com.greatlearning.modeldepartment;

public class HrDepartment extends SuperDepartment {

	private String departmentName = "HR Department";
	private String todaysWork = "Fill today’s timesheet and mark your attendance";
	private String workDeadline = "Complete by EOD";
	private String doActivity = "Team Lunch";

	public String getDepartmentName() {
		return departmentName;
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public String getWorkDeadline() {
		return workDeadline;
	}

	public String getDoActivity() {
		return doActivity;
	}

}
