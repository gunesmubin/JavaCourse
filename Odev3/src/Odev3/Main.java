package Odev3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.id=1;
		instructor.firstName="Engin";
		instructor.lastName="Demiro�";
		instructor.email="ed@ed.com";
		
		Student student=new Student();
		student.id=1;
		student.firstName="M�bin";
		student.lastName="G�ne�";
		student.email="mg@mg.com";
		
		UserManager userManager=new UserManager();
		userManager.add(student);
		userManager.update(instructor);

	}

}
