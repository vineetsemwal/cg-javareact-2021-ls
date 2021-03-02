package stringex;

public class SubStringEx {

    public static void main(String[] args){
        String str="Arpit.MehtaID123456DTIT80L";
        int idIndex=str.indexOf("ID");
        String name=str.substring(0,idIndex);
        int dtIndex=str.indexOf("DT");
        int idEndIndex=idIndex+2;
        String eid=str.substring(idEndIndex,dtIndex);
        int itEndIndex=str.indexOf("IT")+2;
        String salary=str.substring(itEndIndex,str.length()-1);
        Double salaryDouble=Double.parseDouble(salary);
        System.out.println("name="+name +" eid="+eid+" salary="+salaryDouble);
    }
}
