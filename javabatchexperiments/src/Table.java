

public class Table {

	public static void main(String[] args) {
		String names[]= {"abhishek","suriya","abeer"};
		for(int i=0;i<names.length;i++) {
			String iteratedVal=names[i];
			greet(iteratedVal);
		}
		
	}
	
	static void greet(String name) {
		String msg="hello " +name;
		System.out.println(msg);
	}

}
