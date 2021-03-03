package org.cg.apps.coupling;

public class DrawShape {
    private IShape shape;

    public DrawShape(IShape rectangle){
        this.shape =rectangle;
    }
    public DrawShape(){

    }

    public void setShape(IShape shape){
        this.shape=shape;
    }


    public  void  draw(){
        double area= shape.area();
        System.out.println("drawing area of the shape is "+area);
    }

}
