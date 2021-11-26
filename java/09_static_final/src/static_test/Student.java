package static_test;

public class Student {
	
	static String school;
	
	String name;
	int age;
	String grade;
	
	static void setGrade(String grade) {
		//this.grade = grade;
	}
	
	void setSchool(String school) {
		this.school = school;
	}
	
	static String getschool(String school) {
		return Student.school;
	}
	
	static int sum(int x, int y) {
		return x+y;
	}
	
	int result;
	
	void sum(int x, int y, String message) {
		result = x+y;
		System.out.println(message);
	}
}
