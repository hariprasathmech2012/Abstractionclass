package org.abstractclass;

public class Staff implements Student{

	
	public void studentId() {
		System.out.println("student id is 1648");
		
	}

	
	public void studentName() {
		System.out.println("student name is hari");
		
	}


	public void studentMark() {
		System.out.println("student mark is 500");
		
	}
	public static void main(String[] args) {
		
		Staff s = new Staff();
		s.studentId();
		s.studentName();
		s.studentMark();
	}

}
