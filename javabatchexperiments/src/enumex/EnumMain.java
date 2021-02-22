package enumex;

public class EnumMain {

    public static void main(String[] args){
        WeekDay[] weekdays=WeekDay.values();
        for (WeekDay weekday:weekdays){
            System.out.print("weekday="+weekday +" position="+weekday.ordinal());
            System.out.println(" start time="+weekday.getStartTime()+" endtime="+weekday.getEndTime());
        }

        ClassBreak morning1=ClassBreak.MORNING_TEA;
        ClassBreak morning2=ClassBreak.MORNING_TEA;
        ClassBreak lunch1=ClassBreak.LUNCH;
        ClassBreak lunch2=ClassBreak.LUNCH;
        System.out.println("morning break="+(morning1==morning2));
        System.out.println("lunch break="+(lunch1==lunch2));


    }
}
