import student.beans.*;

public class PassByExample {
	
	public static void main(StringExperiment arguments[]) {
		Course course=new Course("c1","java");
		Student original=new Student(1,"tanisha",70,course);
		PassByExample example=new PassByExample();
		example.displayValue(original);// copy of reference
		System.out.println("inside main after dispalyval");
		System.out.println(original.getName());
	}
	
	void displayValue(Student copy){
		System.out.println("inside displayval");
		copy.setName("Rohit");
		System.out.println(copy.getName());
	}

}
