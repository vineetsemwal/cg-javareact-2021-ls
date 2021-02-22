package dateex;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class NewDateEx {

    public static void main(String[] args) {
        //LocalDate localDate = LocalDate.of(1990, 6, 12);
        //System.out.println(localDate.getYear() + " " + localDate.getDayOfMonth() + " " + localDate.getMonthValue());
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd");
        // String formattedDateString=localDate.format(formatter);
        // System.out.println("formatted date="+formattedDateString);

        //String date = "23-05-1996";
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        //LocalDate parsedDate = LocalDate.parse(date, formatter);
        //System.out.println("parsed date is " + parsedDate.getDayOfMonth() + " " + parsedDate.getMonthValue() + " " + parsedDate.getYear());
        Map<String, LocalDate> map = new HashMap<>();
        map.put("shivadr", LocalDate.of(1990, 5, 24));
        map.put("yashadr", LocalDate.of(2005, 5, 24));
        map.put("arpitadr", LocalDate.of(1990, 5, 24));

        NewDateEx example = new NewDateEx();
        List<String> voters = example.voterList(map);
        System.out.println(voters);
    }

    public List<String> voterList(Map<String, LocalDate> map) {
        Set<String> keys = map.keySet();
        List<String>ids=new ArrayList<>();
        LocalDate now = LocalDate.now();
        for (String id : keys) {
            LocalDate dob = map.get(id);
            LocalDate queriedDate = dob.plusYears(18);
            if(queriedDate.isBefore(now)){
                ids.add(id);
            }
        }
        return ids;
    }
}
