package org.cg.apps.coupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Canvas {

    private IShape shape;

    public Canvas(IShape rectangle){
        this.shape =rectangle;
    }
    public Canvas(){

    }

    @Autowired
    public void setShape(IShape shape){
        System.out.println("inside shape,shape is set now ");
        this.shape=shape;
    }

    public IShape getShape(){
        return shape;
    }


    public  void  draw(){
        double area= shape.area();
        System.out.println("drawing area of the shape is "+area);
    }

}
