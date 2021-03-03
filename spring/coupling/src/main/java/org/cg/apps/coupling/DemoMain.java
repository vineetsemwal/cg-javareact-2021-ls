package org.cg.apps.coupling;

public class DemoMain {

    public static void main(String args[]){
        Rectangle rectangle=new Rectangle(3,4);
        Square square=new Square(10);
        DrawShape draw=new DrawShape(square);
        draw.draw();
    }
}
