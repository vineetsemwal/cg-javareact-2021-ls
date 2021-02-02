
public class StudentMain {

	public static void main(String args[]) {
		Student student1=new Student();
		student1.id=1;
		student1.name="abhishek";
		student1.score=70;
		String feedback1=student1.performance();
		System.out.println("student1 "+student1.id+" "+
		student1.name+" "+student1.score+" "+feedback1);
	}
	
}
