package com.projectmanagement;

import java.util.Scanner;

public class Add {
	
	private String project_id;
	private String project_name;
	private String project_no_of_memeber;
	private String project_deadline;
	
	public Add(String project_id,String project_name,String project_no_of_memeber,String project_deadline) {
		this.project_id = project_id;
		this.project_name = project_name;
		this.project_no_of_memeber= project_no_of_memeber;
		this.project_deadline = project_deadline;
	}
	
	public String details() {
		return "Project ID : "+project_id+" Project Name : "+project_name+" Number of people : "
				+project_no_of_memeber+" Deadline : "+project_deadline;
	}
}
