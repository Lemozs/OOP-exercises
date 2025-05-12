package entities;

public class Student {

		public String name;
		public double grade1;
		public double grade2;
		public double grade3;
		
		public double sumGrades() {
			
			return grade1 + grade2 + grade3;
			
		}
		
		public String verification() {
			
			if(sumGrades() >= 60) {
				return "PASS";
			} else {
				return "FAILED\nMissing: " + (60 - sumGrades()) + " Points" ;
			}
			
		}
	
	
}
