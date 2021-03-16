import java.util.*;
import java.util.stream.*;


public class Ex2StreamApi {
	public static void main(String args[]) {
		Ex2StreamApi project = new Ex2StreamApi();
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("ram", "hari");
		map.put("cisco", "barfi");
		map.put("honeywell", "cs");
		map.put("cts", "hari");
		String array[]=project.conversion2(map, "hari");
		for(String element:array){
		System.out.println(element);
		}
		
	}
	
	public String[] conversion2(Map<String, String> map, String toFind){
            Set<String> keys = map.keySet();
	    /*
	    Stream<String>keysStream=keys.stream();
	    Predicate<String>predicate=key->{
	    String value=map.get(key);
	     return value.equalsIgnoreCase(toFind);	  
	    }  	   	
	    Stream<String>filtered=keysStream.filter(predicate); 
	    List<String>keysList=filtered.collect(Collectors.toList());
	   
	   */
	   List<String>keysList=keys.stream().
	                        filter(key->{
	    String value=map.get(key);
	     return value.equalsIgnoreCase(toFind);	  
	    }  	   	
	   ). collect(Collectors.toList());		
	   
	       String array[]=keysList.toArray(new String[0]);
	   	return array;
		
          		   	
		
	}

	public String[] conversion(Map<String, String> map, String toFind) {
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

