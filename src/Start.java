import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws  IOException {
		System.out.println("Welcome to our school");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
        	System.out.println("Press 1 to ADD student");
        	System.out.println("Press 2 to Delete student");
        	System.out.println("Press 3 to show students");
        	System.out.println("Press 5 to Update");
        	System.out.println("Press 4 to exit app");
        	
        	int choice = Integer.parseInt( br.readLine());
        	System.out.println(choice);
        	if(choice ==  1) {
        		//ADD students
        		System.out.println("Enter Student name");
        		String name = br.readLine();
        		
        		System.out.println("Enter Student Ph no");
        		String phno = br.readLine();
        		
        		System.out.println("Enter Student city");
        		String city = br.readLine();
        		
        		Student st = new Student(name, phno, city);
        		Boolean answer =  StudentDao.insertStudentToDao(st);
        		if(answer) {
        			System.out.println("Data Updated successfully");
        		}else {
        			System.out.println("Something went wrong");
        		}
        		System.out.println(st);
        	}else if(choice == 2) {
        		//Delete student
        		System.out.println("Enter userID to delete a record of student");
        		int userID = Integer.parseInt(br.readLine());
        		 Boolean answer = StudentDao.deleteStudent(userID);
        		 if(answer)
        			 System.out.println("Record deleted Sucessfully.....");
        		 else
        			 System.out.println("Some error occured...2");
        	}else if(choice == 3) {
        		//Show students
        		
        		StudentDao.showAllStudents();
        	}else if(choice == 5){
        		//Update here
        		System.out.println("We will updatye some record");
        		Boolean answer = StudentDao.updateStudents();
        		if(answer)
        			System.out.println("Updated successfully");
        		else {
        			System.out.println("Some error occured");
        		}
        	}else if(choice == 4){
        		//Exit App
        		break;
        	}else {
				
			}
        }
        System.out.println("Thank you for using Student management app");
	}

}
