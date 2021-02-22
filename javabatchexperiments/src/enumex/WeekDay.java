package enumex;

public enum WeekDay {


    SUNDAY("9am","6pm"),
    MONDAY("9:30am","6:30pm"),
    TUESDAY("9am","6pm"),
    WEDNESDAY("9am","6pm"),
    THURSDAY("9am","6pm"),
    FRIDAY("9am","6pm"),
    SATURDAY("10am","7pm");
    WeekDay(String startTime, String endTime){
      this.startTime=startTime;
      this.endTime=endTime;
    }

    private String startTime;
    private String endTime;

    public String getStartTime(){
        return startTime;
    }

    public String getEndTime(){
        return endTime;
    }


}
