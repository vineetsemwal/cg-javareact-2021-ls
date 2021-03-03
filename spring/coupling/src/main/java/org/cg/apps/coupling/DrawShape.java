package org.cg.apps.coupling;

public class DrawShape {
    private Rectangle rectangle=new Rectangle(2,5);

    public  void  draw(){
        double area=rectangle.area();
        System.out.println("area of the shape is "+area);
    }

}
