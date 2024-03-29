package ua.kiev.prog;

import java.util.Arrays;
import java.util.logging.Logger;

public class GroupStudents {
	
	private static Logger logger = Logger.getLogger(GroupStudents.class.getName());
	
	private Student[] students = new Student[10];

	public GroupStudents(Student[] students) {
		super();
		this.students = students;
	}
	
	public GroupStudents() {
		super();
	}
	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	public Student insertStudentInGroup(Student student) {
		int countNull = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				countNull++;
				break;
			}
		}
		try {
			if (countNull == 0) {
				throw new MyException();
			}
		} catch (MyException e) {
			logger.info(e + "Exception: Complite group  \n" + " The group already has " + students.length + " students \n");
		}
		return student;
	}

	public Student getStudentoOfGroup(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(student)) {
				students[i] = null;
				break;
			}
		}
		return student;
	}

	
	
	public Student finedStudentInGroup(Student surname) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getSurname().equals(surname)) {
				i++;
				return surname;
			}
		}
		return surname;
	}

	@Override
	public String toString() {
		for (int i = students.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (students[j] != null) {
					if (students[j + 1] != null
							&& students[j].getSurname().charAt(0) > students[j + 1].getSurname().charAt(0)) {
						Student tmp = new Student();
						tmp = students[j];
						students[j] = students[j + 1];
						students[j + 1] = tmp;
					}
				} else {
					students[j] = students[j + 1];
					students[j + 1] = null;
				}
			}
		}
		return Arrays.toString(students);
	}
	
	
	
	

}
