package com.masai.Q2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MyLinkedHashMap {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String,String> myLinkMap = new LinkedHashMap();
		
		myLinkMap.put("Maharashtra", "Mumbai");
		myLinkMap.put("Gao", "Panaji");
		myLinkMap.put("Karnataka", "Bengalore");
		myLinkMap.put("Panjab", "Chandigarh");
		myLinkMap.put("Rajsthan", "Jaipur");
		
		
		Set<Map.Entry<String,String>> stateCap= myLinkMap.entrySet();
		
		System.out.println("*************************************");
		
		for(Map.Entry<String,String> me: stateCap){
			
			System.out.println(me.getKey()+"'s capital is: "+me.getValue());
			System.out.println("*************************************");
		}

	}
}
