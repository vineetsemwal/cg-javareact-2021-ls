import java.util.*;

public class Ex1StreamApi {
	public static void main(String args[]) {
		Ex1 project = new Ex1();
		String arr[]={"goa", "kerala","gujarat"};
		project.run(arr);
	}

	public void run(String arr[]) {
		HashMap<String, String> map = new HashMap<>();
		int arrLen= arr.length;

		for(int i=0;i<arrLen;i++) {
		       String iteratedStr=arr[i]; 
			String key=iteratedStr.substring(0, 3).toUpperCase();
			map.put(key, iteratedStr);
		}
		System.out.println(map);
	}
}
