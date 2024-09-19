
public class MainEx {

	public class Student{
		String firstName;
		String lastName;
		int registration;
		int grade;
		int year;
	
		public Student (String firstName, String lastName,int registration, int grade, int year) {
			this.firstName=firstName;
			this.lastName=lastName;
			this.registration=registration;
			this.grade=grade;
			this.year=year;
		}//constructor Student

	}//class Student
	
	public static void main(String[] args) {
	Student jess = new Student ("Jessica","Vega",314001892,9,6);
	
	public void printFullName(){
		System.out.println(student.firstName+" "+student.lastName);
	}//printFullName
	
	public void isApproved(){
		if (student.grade>=6) {
			System.out.println(student.firstName + " está aprobado");
		}//if mayorigual a seis
	}//isApproved
	
	public int changeYearIfApproved(){
		if(grade>=6) {
			year=year+1;
			System.out.println("Congratulations!");
		}//ifgrade
		return 0;
	}//changeYear
	
	}//mainstringargs
	
}//MainEx
