package enumex;

public class ColorMain {
    public static void main(String[] args){
        PlanterColor color=PlanterColor.getColorByNumber(2);
        System.out.println(color.getColorNumber()+"-"+color.getColor());
    }
}
