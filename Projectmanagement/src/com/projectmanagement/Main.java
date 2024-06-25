package com.projectmanagement;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		LinkedList<String> projects = new LinkedList<>();
		HashSet<String> hashset = new HashSet<>();

		while (running) {
			System.out.println("Enter your choice");
			System.out.println("1> Add");
			System.out.println("2> Display");
			System.out.println("3> Update");
			System.out.println("4> Remove");
			System.out.println("5> Exit");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the project id : ");
				String project_id = sc.next();
				System.out.println("Enter the project name : ");
				String project_name = sc.next();
				System.out.println("Enter the number of members : ");
				String project_no_of_memeber = sc.next();
				System.out.println("Enter the project Deadline : ");
				String project_deadline = sc.next();
				Add add = new Add(project_id, project_name, project_no_of_memeber, project_deadline);
				projects.add(add.details());
				break;
			case 2:
				
				System.out.println("Displaying....");
				System.out.println("Enter your choice");
				System.out.println("1> As it is");
				System.out.println("2> Shuffle");
				int c = sc.nextInt();
				switch(c) {
					case 1:
						projects.forEach(System.out::println);
						break;
					case 2:
						hashset.addAll(projects);
						hashset.forEach(System.out::println);
						break;
				}
				
				break;
			case 3:
				System.out.println("Updating...");
				System.out.println("Enter the id to update");
				Update obj = new Update();
				String value = sc.next();
				projects = obj.update(projects, value);
				System.out.println("Successful Update");;
				break;
			case 4:
				System.out.println("Removing...");
				System.out.println("Enter the id to remove");
				Remove rm = new Remove();
				String st = sc.next();
				projects = rm.delete(projects, st);
				System.out.println("Successful remove");
				break;
			case 5:
				System.out.println("Exiting...");
				System.exit(0);
			default:
				System.out.println("Invalid input");
			}
		}
	}

}
