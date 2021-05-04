package KodlamaIO;

public class Main {

	public static void main(String[] args) {
	Instructor instructor1=new Instructor();
	instructor1.id=1;
	instructor1.name="Engin";
	instructor1.surName="Demiroð";
	instructor1.ratePoint=100;
	
	Course course1=new Course();
	course1.id=1;
	course1.name="Java Eðitim Kampý";
	course1.instructorId=1;
	course1.imgPath="./Course1.jpg";
	
	CourseManager courseManager=new CourseManager();
	courseManager.addToCourse(course1);
	
	InstructorManager instructorManager=new InstructorManager();
	instructorManager.addToInstructor(instructor1);


	}

}
