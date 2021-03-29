package enumex;

public enum PlanterColor {
    RED(1,"red"),
    BLUE(2,"blue"),
    GREEN(3,"green");

    private int colorNumber;
    private String color;

    public int getColorNumber() {
        return colorNumber;
    }

    public String getColor() {
        return color;
    }

    PlanterColor(int colorNumber, String color){
        this.colorNumber=colorNumber;
        this.color=color;
    }


    // Color color=PlanterColor.getColorByNumber(1);
    public static PlanterColor getColorByNumber(int colorNumber){
        PlanterColor colors[]= PlanterColor.values();
        for(PlanterColor color:colors){
            if(color.colorNumber==colorNumber){
                return color;
            }
        }
        return null;
    }

}
