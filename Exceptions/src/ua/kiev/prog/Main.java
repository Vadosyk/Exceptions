package ua.kiev.prog;

import java.util.logging.Logger;

public class Main {
	
	private static Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		Human human = new Human();
		logger.info("The student has such characteristics: \n" + human + "\n");
		Student student1 = new Student("Ivan", "Ivanov", 180, 64,18, "mathematics", 1);
		Student student2 = new Student("Vasya", "Vasilyeva", 155, 45,19, "physics", 3);
		Student student3 = new Student("Tania", "Petrova", 166, 57,19, "computer science", 2);
		Student student4 = new Student("Sasha", "Lebed", 178, 77,22, "physics", 1);
		Student student5 = new Student("Sergey", "Suvorov", 199, 93,18, "computer science", 4);
		Student student6 = new Student("Lyuda", "Pobeda", 158, 59,21, "mathematics", 3);
		Student student7 = new Student("Julia", "Pravda", 172, 65,19, "physics", 5);
		Student student8 = new Student("Vadim", "Chikrizhov", 180, 184,20, "computer science", 1);
		Student student9 = new Student("Maksim", "Prokopov", 167, 111,18, "mathematics", 2);
		Student student10 = new Student("Oksana", "Glushchenko", 155, 87,20, "physics", 4);
		Student student11 = new Student("Ruslan", "Il'chenko", 175, 74,19, "computer science", 2);
		
		//Добавление студентов
		GroupStudents grup = new GroupStudents();
		grup.insertStudentInGroup(student1);
		grup.insertStudentInGroup(student2);
		grup.insertStudentInGroup(student3);
		grup.insertStudentInGroup(student4);
		grup.insertStudentInGroup(student5);
		grup.insertStudentInGroup(student6);
		grup.insertStudentInGroup(student7);
		grup.insertStudentInGroup(student8);
		grup.insertStudentInGroup(student9);
		grup.insertStudentInGroup(student10);
		grup.insertStudentInGroup(student11);
		logger.info("The group is already full: \n" + grup + "\n");
		
		//Удаление студентов
		grup.getStudentoOfGroup(student1);
	
		
		
		logger.info("Now we have 8 students: "+ grup + "\n");
		
		grup.insertStudentInGroup(student11);
		logger.info("Now we have 9 students: "+ grup + "\n");
		
		logger.info(grup.finedStudentInGroup(student1) + "!");
		logger.info(grup.finedStudentInGroup(student5)+ "!");
		logger.info(grup.finedStudentInGroup(student4)+ "!");
	}

}
