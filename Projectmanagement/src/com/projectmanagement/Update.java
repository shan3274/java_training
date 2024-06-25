package com.projectmanagement;

import java.util.LinkedList;
import java.util.Scanner;

public class Update {
	String project_id;
	String project_name;
	String project_no_of_memeber;
	String project_deadline;
	
	public LinkedList<String> update(LinkedList<String> list , String value){
		
		Scanner sc = new Scanner(System.in);
		LinkedList<String> newlist = new LinkedList<String>();
		for (String str : list) {
			if(!str.contains(value)) {
				newlist.add(str);
			}
		}
		System.out.println("Enter the updated project id : ");
		project_id = sc.next();
		System.out.println("Enter the updated project name : ");
		project_name = sc.next();
		System.out.println("Enter the updated number of members : ");
		project_no_of_memeber = sc.next();
		System.out.println("Enter the updated project Deadline : ");
		project_deadline = sc.next();
		newlist.add("Project ID : "+project_id+" Project Name : "+project_name+" Number of people : "
				+project_no_of_memeber+" Deadline : "+project_deadline);
		return newlist;
		
	}
	

}
