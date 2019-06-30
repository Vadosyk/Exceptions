package ua.kiev.prog;

import java.util.logging.Logger;

public class Student extends Human {
	
	private static Logger logger = Logger.getLogger(Student.class.getName());
	
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
	public void  humanInfo(String inf) {
		super.humanInfo (inf);
		logger.info("Man has grown up - " + growth + "\n" + "weight - " + weight + " and age - " + age);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
