package dateex;

import java.util.*;

public class OldDateExample {

    public static void main(String args[]) {
        Map<String, Date> map = new HashMap<>();
        Date date = new Date(90, 6, 23);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDate());
        map.put("shivadr", new Date(90, 5, 24));
        map.put("yashadr", new Date(95, 6, 28));
        map.put("arpitadr", new Date(112, 4, 21));
        OldDateExample example = new OldDateExample();
        List<String> voters = example.votersList(map);
        voters.stream().forEach(System.out::println);
    }

    public List<String> votersList(Map<String, Date> map) {
        Set<String> keys = map.keySet();
        Date current = new Date();
        List<String> eligible = new ArrayList<>();
        for (String key : keys) {
            Date dob = map.get(key);
            //System.out.println(d)
            int yearDiff = current.getYear() - dob.getYear();
            System.out.println("year difference=" + yearDiff);
            if (yearDiff >= 18) {
                eligible.add(key);
            }
        }
        return eligible;
    }

}
