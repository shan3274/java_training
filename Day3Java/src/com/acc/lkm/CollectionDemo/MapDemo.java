package com.acc.lkm.CollectionDemo;
import java.util.*;
public class MapDemo {

public static void main(String args[]) {
	Map<Integer,String>map=new HashMap<>();
	map.put(300,"Bikash");
	map.put(100,"Aman");
	map.put(200,"Shubham");
	map.put(300,null);
	
	//map.put(null, "Rashi");
	//map.put(null, null);
	/*for(Map.Entry m1:map.entrySet()) {
		System.out.println(m1.getKey()+" "+m1.getValue());
	}*/
	map.entrySet()
	.stream()
	.sorted(Map.Entry.comparingByKey())
	.forEach(System.out::println);
}

}
