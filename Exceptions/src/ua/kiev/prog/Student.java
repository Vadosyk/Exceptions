package ua.kiev.prog;

public class Student extends Human {
	
	private String faculty;
	private int course;
	
	
	public Student(String name, String surname, int growth, int weight, int age, String faculty, int course) {
		super(name, surname, growth, weight, age);
		
		this.faculty = faculty;
		this.course = course;
	}
	
	public Student() {
		super();
	}
	
	public String getFaculty() {
		return faculty;
	}


	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}


	public int getCourse() {
		return course;
	}


	public void setCourse(int course) {
		this.course = course;
	}


	@ Override
	public void  HumanInfo(String inf) {
		super.HumanInfo (inf);
		System.out.println("Человек имеет рост - " + growth + " ,вес - " + weight + " и возраст- " + age);
	}
}
