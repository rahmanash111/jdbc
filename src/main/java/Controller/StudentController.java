package Controller;

import java.util.Scanner;

import Dao.StudentDao;
import Dto.Student;

public class StudentController {

	static Scanner s = new Scanner(System.in);
	static StudentDao sdao = new StudentDao();

	public static void main(String[] args) {

		int a = 10;
		do {

			System.out.println("1.add student/n2.find student/n3.delete student/n4.exit");
			int value = s.nextInt();
			switch (value) {
			case 1: {
				save();
				break;
			}
			case 2: {
				find();
				break;
			}
			case 3: {
					delete();
				break;
			}
			case 4: {
					a=20;
				break;
			}

			}
		} while (a == 10);

	}

	public static void save() {
		Student student = new Student();
//		System.out.println("enter the student id:");
//		student.setId(s.nextInt());
		System.out.println("Enter the Student marks:");
		double mark = s.nextDouble();
		student.setMarks(mark);
		System.out.println("enter the Student name");
		student.setName(s.next());

		sdao.save(student);

	}

	public static void find() {
		System.out.println("Enter the Student id");
		int id = s.nextInt();
		Student student = sdao.findById(id);
		if (student != null)
			System.out.println(student);
		else
			System.out.println("no data found");
	}

	public static void delete() {
		System.out.println("Enter the Student id");
		int id = s.nextInt();
		Student student = sdao.findById(id);
		if (student != null) {
			sdao.delete(student);
			System.out.println("deleted");
		} else
			System.out.println("no data found");
	}
}
