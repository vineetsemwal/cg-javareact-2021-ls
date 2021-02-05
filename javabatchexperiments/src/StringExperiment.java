
public class StringExperiment {
	
	public static void main(String args[]) {
		String s1="hello world";
	    char ch= s1.charAt(3);
	    System.out.println("char at 3 "+ch);
	    String trimmed=s1.trim();
	    System.out.println("trimmed "+trimmed);
	    String concated=s1.concat("world");
	    String replaced1=s1.replace('e', 'a');
	    String replaced2 =s1.replace("lo", "re");
	    char array[]=s1.toCharArray();
	    boolean starting=s1.startsWith("he");
	    boolean ending=s1.endsWith("lo");
	    boolean containing=s1.contains("el");
	    String sub3=s1.substring(3);
	    String sub4=s1.substring(4,8);
	    int firstFound=s1.indexOf('l');
	    int lastFound=s1.lastIndexOf('l');
	    int firstFound2=s1.indexOf("llo");
	    int len=s1.length();
	    String s2="hello";
	    boolean equal=s1.matches(s2);
	    
	}

}
