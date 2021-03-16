import java.util.*;



public class Ex2 {
	public static void main(String args[]) {
		Ex2 project = new Ex2();
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("ram", "hari");
		map.put("cisco", "barfi");
		map.put("honeywell", "cs");
		map.put("cts", "hari");
		String array[]=project.conversion(map, "hari");
		for(String element:array){
		System.out.println(element);
		}
		
	}
	
	

	public String[] conversion(HashMap<String, String> map, String toFind) {
		List<String>keysList=new ArrayList<>();
		Set<String> keys = map.keySet();
		for (String key : keys) {
			if (map.get(key).equalsIgnoreCase(toFind)) {
		         keysList.add(key); 		
			}
		}
		
		String array[]=keysList.toArray(new String[0]);
		return array;
		
	}
}

