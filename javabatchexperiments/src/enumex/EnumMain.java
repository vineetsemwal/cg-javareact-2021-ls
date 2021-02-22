package enumex;

public class EnumMain {

    public static void main(String[] args){
        WeekDay[] weekdays=WeekDay.values();
        for (WeekDay weekday:weekdays){
            System.out.print("weekday="+weekday +" position="+weekday.ordinal());
            System.out.println(" start time="+weekday.getStartTime()+" endtime="+weekday.getEndTime());
        }

        ClassBreak morning=ClassBreak.MORNING_TEA;
        System.out.println("morning break="+morning);

    }
}
