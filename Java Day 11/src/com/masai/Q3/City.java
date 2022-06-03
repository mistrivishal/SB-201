package com.masai.Q3;

public enum City {

DELHI{
		
		public void message(){  // overriden method
			System.out.println("welcome user..");
			System.out.println("you are in capital");
		}	
		
	},
	MUMBAI,
  CHENNAI("50 towers"),
	KOLKATA;	
	
	//variables in enum
	public String numberofTowers;
	
	//constructor
	City(){
		this.numberofTowers="100 towers";
	}
	
	City(String numberofTowers){   //overloaded constructor
		
		this.numberofTowers=numberofTowers;
	}
	
	public void message(){
		System.out.println("welcome user..");
	}
}
