package org.univ;

public class College extends University {
	
	public void ug() {
		System.out.println("ug course name is civil engineering");
        super.ug();
	}
	
	public void pg() {
	    System.out.println("pg course is structural engineering");
        super.pg();
	}
	
	public static void main(String[] args) {
		
		
		College c = new College();
		c.ug();
		c.pg();
	
		
		
		
		
	}

}
