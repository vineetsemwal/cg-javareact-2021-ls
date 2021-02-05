

public class Table {

	public static void main(String[] args) {
		int num=10;
		byte byteNum=(byte)num;
		
		
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
