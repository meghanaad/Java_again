package dayone;



class Student{
	int studentId;
	String studentName;
	 static String collegeName= "BalaKuteer";
	public Student(int studentId,String studentName) {
		this.studentId= studentId;
		this.studentName=studentName;
		}
	 public void getStudentDetails() {
		 System.out.println("Student id is:"+ studentId);
		 System.out.println("Student name is:"+ studentName);
		 System.out.println("Student id is:"+ collegeName);
		 
		 }
	 }

public class JavaStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student(1,"Meghana");
		s1.getStudentDetails();
		Student s2= new Student(2,"Anusha");
		s2.getStudentDetails();

	}

}

