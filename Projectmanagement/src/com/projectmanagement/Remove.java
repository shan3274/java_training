package com.projectmanagement;

import java.util.LinkedList;

public class Remove {
public LinkedList<String> delete(LinkedList<String> list , String value){
		
		LinkedList<String> newlist = new LinkedList<String>();
		for (String str : list) {
			if(!str.contains(value)) {
				newlist.add(str);
			}
		}
		return newlist;
		
	}
}
