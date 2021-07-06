import java.util.*;
class Student{
	int serialNo;
	String firstName;
	String cgpa;
	char grade;
Student(){
	serialNo = 0;
	firstName = null;
	cgpa = null;
	grade = 0;
	}
Student(int serialno, String firstname, String cgpa, char grade){
	this.serialNo = serialNo;
	this.firstName = firstName;
	this.cgpa = cgpa;
	this.grade = grade;
	}
void display(){
	System.out.println(serialNo);
	System.out.println(firstName);
	System.out.println(cgpa);
	System.out.println(grade);
}
Scanner input = new Scanner(System.in);

    void setStudent() {
        System.out.print("Enter Serial No : ");
        serialNo = input.nextInt();
        System.out.print("Enter First Name : ");
        firstName = input.next();
        System.out.print("Enter CGPA : ");
        cgpa = input.nextLine();
        System.out.print("Enter grade : ");
        grade = input.next().charAt(0);
    }

    public String toString() {
        return serialNo + "\t" + firstName + "\t" + cgpa + "\t" + grade + "\n"; 
    }

    void getStudent() {
        System.out.print("Serial No : " + serialNo);
        System.out.print("First Name : " + firstName);
        System.out.print("CGPA : " + cgpa);
        System.out.print("garde : " + grade);
    }



}