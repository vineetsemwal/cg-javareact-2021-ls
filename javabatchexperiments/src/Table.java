

public class Table {

	public static void main(StringExperiment[] args) {
		int num=10;
		byte byteNum=(byte)num;
		
		
		StringExperiment names[]= {"abhishek","suriya","abeer"};
		for(int i=0;i<names.length;i++) {
			StringExperiment iteratedVal=names[i];
			greet(iteratedVal);
		}
		
	}
	
	static void greet(StringExperiment name) {
		StringExperiment msg="hello " +name;
		System.out.println(msg);
	}

}
