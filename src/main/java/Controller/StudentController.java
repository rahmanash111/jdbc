package Controller;

import java.util.Scanner;

import Dao.StudentDao;
import Dto.Student;

public class StudentController {

	static Scanner s=new Scanner(System.in);
	static StudentDao sdao=new StudentDao();
	
	public static void main(String[] args) {
	
		Student student=new Student();
//		System.out.println("enter the student id:");
//		student.setId(s.nextInt());
		System.out.println("Enter the Student marks:");
		double mark=s.nextDouble();
		student.setMarks(mark);
		System.out.println("enter the Student name");
		student.setName(s.next());
		
		sdao.save(student);
	}
	
}
